package com.project.exoplanet.Service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.exoplanet.exceptions.ValueReturnMessageEventErro;
import com.project.exoplanet.model.ScientificInformation;
import com.project.exoplanet.modelDTO.ScienceInforDTO;
import com.project.exoplanet.repository.ScientificInforRepository;

@Service
public class ServiceScienceInforma {

	private ModelMapper mapper;
	private ScientificInforRepository scienceIndoReposi;

	public ServiceScienceInforma(ModelMapper mapper, ScientificInforRepository scienceIndoReposi) {
 		this.mapper = mapper;
		this.scienceIndoReposi = scienceIndoReposi;
	}
	
    public ResponseEntity<ScienceInforDTO> saveEntity(ScienceInforDTO scinceInforDTO) {
    	ScientificInformation bodySave = save(mapper.map(scinceInforDTO, ScientificInformation.class));
    	return ResponseEntity
    			        .status(HttpStatus.OK)
    			        .body(mapper.map(bodySave, ScienceInforDTO.class));
    }
	
    ScientificInformation save(ScientificInformation scientificInformation) {
    	DonValueDuplicateDate(scientificInformation);
    	return scienceIndoReposi.save(scientificInformation);
    }
    
	public void DonValueDuplicateDate(ScientificInformation scientificInformation) {
		ScientificInformation find = scienceIndoReposi.findAllByNome(scientificInformation.getNome());
		if(find != null && find.getId() != scientificInformation.getId()) {
			throw new ValueReturnMessageEventErro("o exoplaneta "+scientificInformation.getNome()+" já se encontra cadastrado");		 
		}
	}
	
	
	public ResponseEntity<ScienceInforDTO> listId(Long id) {
		Optional<ScientificInformation> list = scienceIndoReposi.findById(id);
		if(list.isPresent()) {
			return ResponseEntity.ok(mapper.map(list.get(), ScienceInforDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}






















