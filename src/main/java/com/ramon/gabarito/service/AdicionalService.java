package com.ramon.gabarito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramon.gabarito.domain.Adicional;
import com.ramon.gabarito.repository.AdicionalRepository;

public class AdicionalService {

	@Autowired
	private AdicionalRepository adicionalRepository;
	
	public void insert(Adicional adicional) {
	
		adicionalRepository.save(adicional);
		
	}

	public List<Adicional> list() {
		return adicionalRepository.findAll();
	}

	
}
