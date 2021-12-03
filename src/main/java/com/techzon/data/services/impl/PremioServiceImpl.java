package com.techzon.data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techzon.data.dao.PremioDao;
import com.techzon.data.services.PremioService;

@Service
public class PremioServiceImpl implements PremioService {
	
	@Autowired
	private PremioDao premioDao;
}
