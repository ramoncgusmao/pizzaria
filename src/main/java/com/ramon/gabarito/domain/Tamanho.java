package com.ramon.gabarito.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PZ01_TAMANHO")
public class Tamanho implements ItemDoPedido {

	@Column(name = "PZ01_ID_TAMANHO")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "PZ01_DESCRICAO", length = 20)
	private String descricao;
	
	@Column(name = "PZ01_TEMPO")
	private Integer tempo;
	
	@Column(name = "PZ01_PRECO")
	private Double preco;
	
	public Tamanho() {
		tempo = 0;
		preco = 0.0;
	}
	

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return preco;
	}

	@Override
	public int getTempo() {
		// TODO Auto-generated method stub
		return tempo;
	}
}
