package com.project.exoplanet.Service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.exoplanet.exceptions.ValueReturnMessageEventErro;
import com.project.exoplanet.model.ScientificInformation;
import com.project.exoplanet.repository.ScientificInforRepository;

@Service
public class ServiceScienceInforma {

	private ModelMapper mapper;
	private ScientificInforRepository scienceIndoReposi;

	public ServiceScienceInforma(ModelMapper mapper, ScientificInforRepository scienceIndoReposi) {
		super();
		this.mapper = mapper;
		this.scienceIndoReposi = scienceIndoReposi;
	}

	public ScientificInformation save(ScientificInformation scinceInforma) {
		DonValueDuplicateDate(scinceInforma);
		ScientificInformation salvar = scienceIndoReposi.save(scinceInforma);
		return salvar;
	}
	
	public void DonValueDuplicateDate(ScientificInformation scientificInformation) {
		ScientificInformation find = scienceIndoReposi.findAllByNome(scientificInformation.getNome());
		if(find != null && find.getId() != scientificInformation.getId()) {
			throw new ValueReturnMessageEventErro("o exoplaneta "+scientificInformation.getNome()+" já se encontra cadastrado");
					 
		}
	}
}
