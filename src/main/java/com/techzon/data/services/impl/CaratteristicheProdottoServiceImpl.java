package com.techzon.data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techzon.data.dao.CaratteristicheProdottoDao;
import com.techzon.data.services.CaratteristicheProdottoService;

@Service
public class CaratteristicheProdottoServiceImpl implements CaratteristicheProdottoService {
	
	@Autowired
	private CaratteristicheProdottoDao caratteristicheProdottoDao;

}
