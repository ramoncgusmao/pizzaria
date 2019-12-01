package com.ramon.gabarito.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PZ03_ADICIONAL")
public class Adicional implements ItemDoPedido{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PZ03_ID_ADICIONAL")
	private Integer id;
	
	@Column(name = "PZ03_DESCRICAO", nullable = false)
	private String descricao; 
	
	@Column(name = "PZ03_TEMPO")
	private int tempo;
	
	@Column(name = "PZ03_PRECO")
	private Double preco;
	
	@ManyToMany(mappedBy = "adicionais")
	Set<Pedido> pedidos = new HashSet<Pedido>();
	
	public Adicional() {
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
