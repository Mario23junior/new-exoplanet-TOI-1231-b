package com.project.exoplanet.modelDTO;

public class SubNoturnoDTO {

	private Double massa;
	private String orbitalRadius;
	private String periodoOrbital;
	private String ecentricidade;

	public SubNoturnoDTO() {
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
