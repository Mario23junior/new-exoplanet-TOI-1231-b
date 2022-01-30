package com.project.exoplanet.recoverData;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.project.exoplanet.model.ScientificInformation;
import com.project.exoplanet.modelDTO.ScienceInforDTO;
import com.project.exoplanet.repository.ScientificInforRepository;

@Service
public class RecoverDataFinal {

	private ScientificInforRepository reposi;
	private ModelMapper mapper;

	public RecoverDataFinal(ScientificInforRepository reposi, ModelMapper mapper) {
		this.reposi = reposi;
		this.mapper = mapper;
	}

	public List<ScienceInforDTO> listAllDateFinal() {
		return ((List<ScientificInformation>) reposi
				.findAll())
				.stream()
				.map(this::ConvertDataFilterDto)
				.collect(Collectors.toList());			          	          
    }
	
	public ScienceInforDTO ConvertDataFilterDto(ScientificInformation scine) {
  		mapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.LOOSE);
  		ScienceInforDTO scienceInfDto = mapper.map(scine,ScienceInforDTO.class);
  		return scienceInfDto;
	}
	
	public List<ScienceInforDTO> listAll() {
		List<ScienceInforDTO> list = listAllDateFinal();
		return list
				.stream()
				.collect(Collectors.toList());
	}

	 

}
