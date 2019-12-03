package com.ramon.gabarito.dto;

import java.util.ArrayList;
import java.util.List;

import com.ramon.gabarito.domain.Pedido;

import lombok.Data;

@Data
public class DtoReceberPedido {

	private int sabor;
	private Integer tamanho;
	private List<Integer> adicionais = new ArrayList();
	
	
	

}
