package com.techzon.data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techzon.data.dto.ProdottoDto;
import com.techzon.data.entities.Prodotto;

@Repository
public interface ProdottoDao extends JpaRepository<Prodotto, Long>{
	
	List<Prodotto> findAll();
} 
