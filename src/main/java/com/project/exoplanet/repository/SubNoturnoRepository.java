package com.project.exoplanet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.exoplanet.model.SubNoturno;

public interface SubNoturnoRepository extends JpaRepository<SubNoturno, Long>{
   
	public SubNoturno findByPeriodoOrbital (String nome);
}
