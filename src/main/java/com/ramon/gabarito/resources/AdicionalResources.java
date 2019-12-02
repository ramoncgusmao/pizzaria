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

import com.ramon.gabarito.domain.Adicional;
import com.ramon.gabarito.service.AdicionalService;

@RestController
@RequestMapping(name = "/adicional")
public class AdicionalResources {

	@Autowired
	private AdicionalService adicionalService;
	
	
	@PostMapping
	public void insert(@Valid @RequestBody Adicional adicional) {
		
		adicionalService.insert(adicional);
	}
	
	@GetMapping()
	public ResponseEntity<List<Adicional>> list(){
		List<Adicional> adicionais = adicionalService.list();
		return ResponseEntity.ok().body(adicionais);
	}
}
