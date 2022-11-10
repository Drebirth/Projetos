package com.listaDeCompra.Lista.de.compras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listaDeCompra.Lista.de.compras.models.Carrinho;

public interface ListaRepository extends JpaRepository<Carrinho, Long> {
	
//	Carrinho findById(long id);
//	Carrinho deleteById(long id);
//	Carrinho findBynomeLike(String nome);

	
}
