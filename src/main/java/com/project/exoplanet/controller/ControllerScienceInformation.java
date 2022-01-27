package com.project.exoplanet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.exoplanet.Service.ServiceScienceInforma;
import com.project.exoplanet.modelDTO.ScienceInforDTO;

@RestController
@RequestMapping("/project/api/exoplanet/v1/")
public class ControllerScienceInformation {
   
	private ServiceScienceInforma service;
	
	public ControllerScienceInformation(ServiceScienceInforma service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<ScienceInforDTO> save(@RequestBody ScienceInforDTO scienceInformation ) {
		return service.saveEntity(scienceInformation);
	}

    @GetMapping("{id}")
    public ResponseEntity<ScienceInforDTO> list(@PathVariable Long id) {
    	return service.listId(id);
    }
}
