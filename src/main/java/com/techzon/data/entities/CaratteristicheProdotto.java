package com.techzon.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "CARATTERISTICHE_PRODOTTO")
public class CaratteristicheProdotto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Basic(optional = false)
	@Column(name = "MODELLO")
	private String modello;
	
	@Basic(optional = false)
	@Column(name = "COLORE")
	private String colore;
	
	@Basic(optional = false)
	@Column(name = "PESO")
	private Double peso;
	
	@Basic(optional = false)
	@Column(name = "LUNGHEZZA")
	private Double lunghezza;
	
	@Basic(optional = false)
	@Column(name = "LARGHEZZA")
	private Double larghezza;
	
	@OneToOne(mappedBy = "caratteristicheProdotto")
	private Prodotto prodotto;
	
	public CaratteristicheProdotto() {}
	
	
}
