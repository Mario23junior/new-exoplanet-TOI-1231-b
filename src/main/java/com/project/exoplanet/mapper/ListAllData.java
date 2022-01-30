package com.project.exoplanet.mapper;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.exoplanet.modelDTO.ScienceInforDTO;
import com.project.exoplanet.recoverData.RecoverDataFinal;

@RestController
@RequestMapping("/project/api/exoplanet/data/all/v1/")
public class ListAllData {

	private RecoverDataFinal recoverData;

	public ListAllData(RecoverDataFinal recoverData) {
		this.recoverData = recoverData;
	}
	
	@GetMapping
	 public List<ScienceInforDTO> listAll(){
		return recoverData.listAllDateFinal();
		
   }
}
