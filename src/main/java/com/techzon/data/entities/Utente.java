package com.techzon.data.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name = "UTENTE")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Basic(optional = false)
	@Column(name = "NOME", length = 40)
	private String  nome;
	
	@Basic(optional = false)
	@Column(name = "COGNOME", length = 40)
	private String  cognome;
	
	@Basic(optional = false)
	@Column(name = "EMAIL", unique = true)
	private String  email;
	
	@Basic(optional = false)
	@Column(name = "PASSWORD")
	private String  password;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "citta", column = @Column(name = "CITTA")),
		@AttributeOverride(name = "via", column = @Column(name = "VIA")),
		@AttributeOverride(name = "cap", column = @Column(name = "CAP"))
	})
	private Indirizzo indirizzo;
	
	@Basic(optional = false)
	@Column(name = "TELEFONO")
	private Long telefono;
	
	@Basic(optional = false)
	@Column(name = "SALDO")
	private Double saldo;
	
	@Basic(optional = false)
	@Column(name = "BLOCCATO")
	private Boolean bloccato;
	
	@Basic(optional = false)
	@Column(name = "PUNTI")
	private Integer punti;
	
	@OneToMany(mappedBy = "vendutoDa")
	private List<Prodotto> prodottiVenduti = new ArrayList<>();
	
	@ManyToMany(mappedBy = "compratoDa")
	private List<Prodotto> prodottiComprati = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(
			name = "UTENTE_PREMI",
			joinColumns = @JoinColumn(name = "ID_UTENTE", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_PREMIO", referencedColumnName = "ID")
		)
	private List<Premio> premiRiscattati = new ArrayList<>();
	
	public Utente() {}
	
}
