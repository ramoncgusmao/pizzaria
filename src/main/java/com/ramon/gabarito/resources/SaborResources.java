package com.ramon.gabarito.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramon.gabarito.domain.Sabor;
import com.ramon.gabarito.service.SaborService;

@RestController
@RequestMapping(value = "/sabor")
public class SaborResources {
	
	@Autowired
	private SaborService saborService;
	
	@PostMapping()
	public void insert(@Valid @RequestBody Sabor sabor) {
		
		saborService.insert(sabor);
	}

	
	@GetMapping()
	public ResponseEntity<List<Sabor>> list() {
		
		List<Sabor> lista = saborService.list();
		
		return ResponseEntity.ok().body(lista);
	}
}
