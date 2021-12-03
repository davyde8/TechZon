package com.techzon.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="ID")
	private Long id;
	
	@Basic(optional = false)
	@Column(name="EMAIL")
	private String email;
	
	@Basic(optional = false)
	@Column(name="PASSWORD")
	private String password;
	
	public Admin() {}
}
