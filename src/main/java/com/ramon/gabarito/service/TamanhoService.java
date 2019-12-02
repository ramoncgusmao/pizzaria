package com.ramon.gabarito.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramon.gabarito.domain.Tamanho;
import com.ramon.gabarito.repository.TamanhoRepository;

public class TamanhoService {

	@Autowired
	private TamanhoRepository tamanhoRepository;
	
	public void insert(@Valid Tamanho tamanho) {
		
		tamanhoRepository.save(tamanho);
		
	}

	public List<Tamanho> list() {
		// TODO Auto-generated method stub
		return tamanhoRepository.findAll();
	}


}
