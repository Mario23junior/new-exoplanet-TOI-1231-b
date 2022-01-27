package com.project.exoplanet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.exoplanet.Service.ServiceScienceInforma;
import com.project.exoplanet.model.ScientificInformation;

@RestController
@RequestMapping("/project/api/exoplanet/v1/")
public class ControllerScienceInformation {
   
	private ServiceScienceInforma service;
	
	public ControllerScienceInformation(ServiceScienceInforma service) {
		this.service = service;
	}
	
	@PostMapping
	public ScientificInformation save(@RequestBody ScientificInformation scienceInformation ) {
		return service.save(scienceInformation);
	}
}
