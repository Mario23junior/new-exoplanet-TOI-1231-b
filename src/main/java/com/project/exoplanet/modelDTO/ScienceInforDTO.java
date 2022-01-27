package com.project.exoplanet.modelDTO;

import java.util.Date;

public class ScienceInforDTO {

	private String nome;
	private Integer numeroDeLuas;
	private String tipoPlaneta;
	private Date dataLancamento;
	private String proximos;

	public ScienceInforDTO() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroDeLuas() {
		return numeroDeLuas;
	}

	public void setNumeroDeLuas(Integer numeroDeLuas) {
		this.numeroDeLuas = numeroDeLuas;
	}

	public String getTipoPlaneta() {
		return tipoPlaneta;
	}

	public void setTipoPlaneta(String tipoPlaneta) {
		this.tipoPlaneta = tipoPlaneta;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getProximos() {
		return proximos;
	}

	public void setProximos(String proximos) {
		this.proximos = proximos;
	}

}
