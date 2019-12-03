package com.ramon.gabarito.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramon.gabarito.domain.Pedido;
import com.ramon.gabarito.dto.DtoReceberPedido;
import com.ramon.gabarito.service.PedidoService;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoResources {

	@Autowired
	private PedidoService pedidoService;
	@PostMapping()
	public ResponseEntity<Pedido> receberPedido(@Valid @RequestBody DtoReceberPedido dtoReceberPedido) {
		
		Pedido pedido = pedidoService.receberPedido(dtoReceberPedido) ;
		
		return ResponseEntity.ok().body(pedido);
	}
}
