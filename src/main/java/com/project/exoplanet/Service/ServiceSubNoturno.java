package com.project.exoplanet.Service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.exoplanet.exceptions.ValueReturnMessageEventErro;
import com.project.exoplanet.model.SubNoturno;
import com.project.exoplanet.modelDTO.SubNoturnoDTO;
import com.project.exoplanet.repository.SubNoturnoRepository;

@Service
public class ServiceSubNoturno {
    
	private ModelMapper mapper;
	private SubNoturnoRepository repository;
	
	public ServiceSubNoturno(ModelMapper mapper,SubNoturnoRepository repository) {
		this.mapper = mapper;
		this.repository = repository;
 	}
	
	public ResponseEntity<SubNoturnoDTO> saveBody(SubNoturnoDTO subNotuDto) {
	   SubNoturno saveBody = saveBodySubNoturno(mapper.map(subNotuDto, SubNoturno.class));
	   return ResponseEntity
			              .status(HttpStatus.OK)
			              .body(mapper.map(saveBody, SubNoturnoDTO.class));
	}
	
    SubNoturno saveBodySubNoturno(SubNoturno subNoturno) {
    	DonValueDuplicateDate(subNoturno);
    	return repository.save(subNoturno);
    }
    
    
    public void DonValueDuplicateDate(SubNoturno subNoturno) {
    	SubNoturno find = repository.findByPeriodoOrbital(subNoturno.getPeriodoOrbital());
		if(find != null && find.getId() != subNoturno.getId()) {
			throw new ValueReturnMessageEventErro("Informação "+subNoturno.getPeriodoOrbital()+" já se encontra cadastrada");		 
		}
	}
    
    public ResponseEntity<SubNoturnoDTO> listId(Long id) {
    	Optional<SubNoturno> listId = repository.findById(id);
    	if(listId.isPresent()) {
    		return ResponseEntity.ok(mapper.map(listId.get(), SubNoturnoDTO.class));
    	} else {
    		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    	}
    }
 }











