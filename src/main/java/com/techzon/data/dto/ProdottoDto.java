package com.techzon.data.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProdottoDto implements Serializable {

	private Long id;
	
	private String nome;
	
	private String categoria;
	
	private Double prezzo;
	
	private Double sconto;
	
	private Boolean disponibile;
	
	private Integer quantita;
	
	private Integer contVendite;
	
	private LocalDate dataAggiunta;
	
	public ProdottoDto() {}

	public ProdottoDto(Long id, String nome, String categoria, Double prezzo, Double sconto, Boolean disponibile,
			Integer quantita, Integer contVendite, LocalDate dataAggiunta) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
		this.sconto = sconto;
		this.disponibile = disponibile;
		this.quantita = quantita;
		this.contVendite = contVendite;
		this.dataAggiunta = dataAggiunta;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public Double getSconto() {
		return sconto;
	}

	public void setSconto(Double sconto) {
		this.sconto = sconto;
	}

	public Boolean getDisponibile() {
		return disponibile;
	}

	public void setDisponibile(Boolean disponibile) {
		this.disponibile = disponibile;
	}

	public Integer getQuantita() {
		return quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	public Integer getContVendite() {
		return contVendite;
	}

	public void setContVendite(Integer contVendite) {
		this.contVendite = contVendite;
	}

	public LocalDate getDataAggiunta() {
		return dataAggiunta;
	}

	public void setDataAggiunta(LocalDate dataAggiunta) {
		this.dataAggiunta = dataAggiunta;
	}
	
}
