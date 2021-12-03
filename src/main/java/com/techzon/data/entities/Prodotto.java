package com.techzon.data.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "PRODOTTO")
public class Prodotto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Basic(optional = false)
	@Column(name = "NOME", length = 30)
	private String nome;
	
	@Basic(optional = false)
	@Column(name = "CATEGORIA")
	private String categoria;
	
	@Basic(optional = false)
	@Column(name = "PREZZO")
	private Double prezzo;
	
	@Basic(optional = false)
	@Column(name = "SCONTO")
	private Double sconto;
	
	@Basic(optional = false)
	@Column(name = "DISPONIBILE")
	private Boolean disponibile;
	
	@Basic(optional = false)
	@Column(name = "QUANTITA")
	private Integer quantita;
	
	@Basic(optional = false)
	@Column(name = "CONT_VENDITE")
	private Integer contVendite;
	
	@Basic(optional = false)
	@Column(name = "DATA_AGGIUNTA")
	private LocalDate dataAggiunta;
	
	@OneToOne
	@JoinColumn(name = "ID_CARATTERISTICA", referencedColumnName = "ID")
	private CaratteristicheProdotto caratteristicheProdotto;
	
	@ManyToOne
	@JoinColumn(name = "VENDUTO_DA", referencedColumnName = "ID")
	private Utente vendutoDa;
	
	@ManyToMany
	@JoinTable(
		name = "UTENTE_PRODOTTO",
		joinColumns = @JoinColumn(name = "ID_PRODOTTO", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name = "ID_UTENTE", referencedColumnName = "ID")
	)
	private List<Utente> compratoDa = new ArrayList<>();
	
	public Prodotto() {}

	
}
