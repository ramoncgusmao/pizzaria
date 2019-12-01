package com.ramon.gabarito.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "PZ04_PEDIDO")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PZ04_ID_PEDIDO")
	private Integer id;
	
	@ManyToOne()
	@JoinColumn(name = "PZ01_ID_TAMANHO")
	private Tamanho tamanho;
	
	@ManyToOne()
	@JoinColumn(name = "PZ02_ID_SABOR")
	private Sabor sabor;
	
	
	@ManyToMany
	@JoinTable(
			  name = "PZ05_ADICIONAIS_PEDIDO", 
			  joinColumns = @JoinColumn(name = "PZ04_ID_PEDIDO"), 
			  inverseJoinColumns = @JoinColumn(name = "PZ03_ID_ADICIONAL"))
	private Set<Adicional> adicionais;
	
	private int tempoTotal = 0;
	
	private double precoTotal = 0.0;
	
	public void  setTamanho(Tamanho tamanho) {
		processaValoresItemPedido(this.tamanho, tamanho);
		this.tamanho = tamanho;
	}
	
	public void  setSabor(Sabor sabor) {
		processaValoresItemPedido(this.sabor, sabor);
		this.sabor = sabor;
	}
	
	public void  setAdicionais(Set<Adicional> adicionais) {
		adicionais.stream().forEach(x -> this.setAdicional(x));
	}
	
	public void setAdicional(Adicional adicional) {
		if(adicionais.contains(adicional)){
			return;
		}
		processaValoresItemPedido(null, adicional);
		adicionais.add(adicional);
	}
	
	private void processaValoresItemPedido(ItemDoPedido itemAtual, ItemDoPedido itemNovo) {
		if(itemNovo == null) {
			return;
		}
		
		if(itemAtual != null) {
			tempoTotal -= itemAtual.getTempo();

			precoTotal -= itemAtual.getPreco();
		}
		
		tempoTotal += itemNovo.getTempo();

		precoTotal += itemNovo.getPreco();
		return;
	}
	

	
	
}
