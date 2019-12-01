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
@Table(name = "PZ02_SABOR")
public class Sabor implements ItemDoPedido{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PZ02_ID_SABOR")
	private Integer id;
	
	@Column(name = "PZ02_DESCRICAO", length = 30)
	private String descricao; 
	
	@Column(name = "PZ02_TEMPO")
	private Integer tempo;
	
	@Column(name = "PZ02_PRECO")
	private Double preco;
	
	public Sabor() {
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
