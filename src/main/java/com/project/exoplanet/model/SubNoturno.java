package com.project.exoplanet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubNoturno {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double massa;
	private String orbitalRadius;
	private String periodoOrbital;
	private String ecentricidade;
	
	public SubNoturno() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getMassa() {
		return massa;
	}

	public void setMassa(Double massa) {
		this.massa = massa;
	}

	public String getOrbitalRadius() {
		return orbitalRadius;
	}

	public void setOrbitalRadius(String orbitalRadius) {
		this.orbitalRadius = orbitalRadius;
	}

	public String getPeriodoOrbital() {
		return periodoOrbital;
	}

	public void setPeriodoOrbital(String periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}

	public String getEcentricidade() {
		return ecentricidade;
	}

	public void setEcentricidade(String ecentricidade) {
		this.ecentricidade = ecentricidade;
	}
	
	
 
}
