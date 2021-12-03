package com.techzon.data.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "PREMIO")
public class Premio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Basic(optional = false)
	@Column(name = "VALORE")
	private Integer valore;
	
	@Basic(optional = false)
	@Column(name="PUNTI")
	private Integer punti;
	
	@Basic(optional = false)
	@Column(name="NOME")
	private String nome;
	
	@ManyToMany(mappedBy = "premiRiscattati")
	private List<Utente> hannoRiscattato = new ArrayList<>();
	
	public Premio() {}
}
