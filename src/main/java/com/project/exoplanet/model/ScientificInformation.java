package com.project.exoplanet.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ScientificInformation {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private Integer numeroDeLuas;
	private String tipoPlaneta;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy")
	private Date dataLancamento;
	private String proximos;
	
	@OneToMany(mappedBy = "scientificInformation", cascade = CascadeType.ALL)
	List<SubNoturno> subNoturno;
			
	public ScientificInformation() {
		// TODO Auto-generated constructor stu
	}

	public List<SubNoturno> getSubNoturn() {
		return subNoturno;
	}

	public void setSubNoturno(List<SubNoturno> subNoturno) {
		this.subNoturno = subNoturno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
