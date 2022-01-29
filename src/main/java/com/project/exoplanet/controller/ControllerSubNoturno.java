package com.project.exoplanet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.exoplanet.Service.ServiceSubNoturno;
import com.project.exoplanet.modelDTO.SubNoturnoDTO;

@RestController
@RequestMapping("/project/api/nunoturno/v1/")
public class ControllerSubNoturno {

	private ServiceSubNoturno service;

	public ControllerSubNoturno(ServiceSubNoturno service) {
  		this.service = service;
	}

	@PostMapping
	public ResponseEntity<SubNoturnoDTO> save(@RequestBody SubNoturnoDTO subNutDto) {
		return service.saveBody(subNutDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<SubNoturnoDTO> list(@PathVariable Long id) {
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<SubNoturnoDTO> update(@PathVariable Long id, @RequestBody SubNoturnoDTO subNotDto) {
		return service.updateInfo(id, subNotDto);
	}
}


















