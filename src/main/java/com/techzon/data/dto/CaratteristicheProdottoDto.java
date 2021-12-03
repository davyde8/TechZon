package com.techzon.data.dto;

import java.io.Serializable;

import com.techzon.data.entities.Prodotto;

public class CaratteristicheProdottoDto implements Serializable {
	public CaratteristicheProdottoDto() {}
	private static final long serialVersionUID = 1L;
	public Long getId() {
		return id;
	}
	public CaratteristicheProdottoDto(Long id, String modello, String colore, Double peso, Double lunghezza,
			Double larghezza, Prodotto prodotto) {
		super();
		this.id = id;
		this.modello = modello;
		this.colore = colore;
		this.peso = peso;
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
		this.prodotto = prodotto;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(Double lunghezza) {
		this.lunghezza = lunghezza;
	}
	public Double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(Double larghezza) {
		this.larghezza = larghezza;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private Long id;
	private String modello;
	private String colore;
	private Double peso;
	private Double lunghezza;
	private Double larghezza;
	private Prodotto prodotto;
}
