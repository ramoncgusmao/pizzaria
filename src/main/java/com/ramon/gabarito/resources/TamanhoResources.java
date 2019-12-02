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

import com.ramon.gabarito.domain.Tamanho;
import com.ramon.gabarito.service.TamanhoService;

@RestController
@RequestMapping(name = "/tamanho")
public class TamanhoResources {

	@Autowired
	private TamanhoService tamanhoService;
	
	
	@PostMapping
	public void insert(@Valid @RequestBody Tamanho tamanho) {
		
		tamanhoService.insert(tamanho);
	}
	
	@GetMapping
	public ResponseEntity<List<Tamanho>> list(){
		
		List<Tamanho> lista = tamanhoService.list();
		
		return ResponseEntity.ok().body(lista);
	}
}
