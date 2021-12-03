package com.techzon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.techzon.data.dto.ProdottoDto;
import com.techzon.data.services.ProdottoService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdottoController {

	@Autowired
	private ProdottoService prodottoService;
	
	@GetMapping("/prodotto")
	public ResponseEntity<List<ProdottoDto>> all() {
	    return ResponseEntity.ok(prodottoService.getAll());
	}
	
}
