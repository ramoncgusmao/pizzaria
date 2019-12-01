package com.ramon.gabarito.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramon.gabarito.domain.Sabor;
import com.ramon.gabarito.repository.SaborRepository;

@Service
public class SaborService {

	
	@Autowired
	private SaborRepository saborRepository;
	
	public void insert(@Valid Sabor sabor) {
		
		saborRepository.save(sabor);
	}

	public List<Sabor> list() {
		// TODO Auto-generated method stub
		return saborRepository.findAll();
	}

}
