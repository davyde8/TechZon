package com.techzon.data.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techzon.data.dao.ProdottoDao;
import com.techzon.data.dto.ProdottoDto;
import com.techzon.data.entities.Prodotto;
import com.techzon.data.services.ProdottoService;

@Service
public class ProdottoServiceImpl implements ProdottoService {
	
	@Autowired
	private ProdottoDao prodottoDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<ProdottoDto> getAll() {
		 List<Prodotto> prodotti = prodottoDao.findAll();
		 return prodotti.stream().map(prod -> modelMapper.map(prod, ProdottoDto.class)).collect(Collectors.toList());
	}
}
