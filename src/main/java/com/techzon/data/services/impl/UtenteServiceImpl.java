package com.techzon.data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techzon.data.dao.UtenteDao;
import com.techzon.data.services.UtenteService;

@Service
public class UtenteServiceImpl implements UtenteService {
	
	@Autowired
	private UtenteDao utenteDao;
}
