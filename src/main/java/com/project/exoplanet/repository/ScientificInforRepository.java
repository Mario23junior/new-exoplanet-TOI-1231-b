package com.project.exoplanet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.exoplanet.model.ScientificInformation;

public interface ScientificInforRepository extends JpaRepository<ScientificInformation, Long>{
   
	public ScientificInformation findAllByNome(String nome);
}
