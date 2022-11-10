package com.listaDeCompra.Lista.de.compras.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

//Obs: Nao colocar nome da tabela, estava dando erro.
@Entity
public class Carrinho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(nullable = false, length = 80)
	private String nome;

	@NotNull
	@Column(nullable = false)
	private BigDecimal preco;

	@NotNull
	@Column(nullable = false)
	private Boolean comprado;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Boolean getComprado() {
		return comprado;
	}
	public void setComprado(Boolean comprado) {
		this.comprado = comprado;
	}

	
	
	
	
	
	

}
