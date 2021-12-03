package com.techzon.data.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Indirizzo {

	private String citta;
	private String via;
	private String cap;
	
	public Indirizzo() {}
	
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	
	
	
	
	
}
