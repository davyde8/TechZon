package com.techzon.data.dto;

import java.io.Serializable;

public class PremioDto implements Serializable{
	
	private Long id;
	
	private Integer valore;
	
	private Integer punti;
	
	private String nome;
	
	public PremioDto() {}

	public PremioDto(Long id, Integer valore, Integer punti, String nome) {
		this.id = id;
		this.valore = valore;
		this.punti = punti;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getValore() {
		return valore;
	}

	public void setValore(Integer valore) {
		this.valore = valore;
	}

	public Integer getPunti() {
		return punti;
	}

	public void setPunti(Integer punti) {
		this.punti = punti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
