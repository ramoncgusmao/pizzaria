package com.ramon.gabarito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramon.gabarito.domain.Pedido;
import com.ramon.gabarito.dto.DtoReceberPedido;

@Service
public class PedidoService {

	@Autowired
	private SaborService saborService;
	
	@Autowired
	private TamanhoService tamanhoService;
	
	@Autowired
	private AdicionalService adicionalService;
	
	public Pedido receberPedido(DtoReceberPedido dtoReceberPedido) {
		
		Pedido pedido = dtoToPedido(dtoReceberPedido);
		
		return pedido;
	}

	private Pedido dtoToPedido(DtoReceberPedido dtoReceberPedido) {
	
			
			Pedido pedido = Pedido
					.builder()
					.sabor(saborService.find(dtoReceberPedido.getSabor()))
					.tamanho(tamanhoService.find(dtoReceberPedido.getTamanho()))
					.adicionais(adicionalService.findList(dtoReceberPedido.getAdicionais()))
					.build();
					
			return pedido;
		
	}

	
}
