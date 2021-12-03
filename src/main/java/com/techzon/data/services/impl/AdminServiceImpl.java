package com.techzon.data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techzon.data.dao.AdminDao;
import com.techzon.data.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao adminDao;
	
}
