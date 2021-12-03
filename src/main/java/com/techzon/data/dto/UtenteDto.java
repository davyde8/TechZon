package com.techzon.data.dto;

import java.io.Serializable;

import com.techzon.data.entities.Indirizzo;

public class UtenteDto implements Serializable{
	
	private Long id;
	
	private String nome;
	
	private String cognome;
	
	private String email;
	
	private String password;
	
	private Indirizzo indirizzo;
	
	private Long telefono;
	
	private Double saldo;
	
	private Boolean bloccato;
	
	private Integer punti;

	public UtenteDto() {}
	
	public UtenteDto(Long id, String nome, String cognome, String email, String password, Indirizzo indirizzo,
			Long telefono, Double saldo, Boolean bloccato, Integer punti) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.saldo = saldo;
		this.bloccato = bloccato;
		this.punti = punti;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean getBloccato() {
		return bloccato;
	}

	public void setBloccato(Boolean bloccato) {
		this.bloccato = bloccato;
	}

	public Integer getPunti() {
		return punti;
	}

	public void setPunti(Integer punti) {
		this.punti = punti;
	}
	
	
	
	
}
