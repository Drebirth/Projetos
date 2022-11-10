package com.listaDeCompra.Lista.de.compras.Services;


import com.listaDeCompra.Lista.de.compras.exception.ProdutoNaoEncontradoException;
import com.listaDeCompra.Lista.de.compras.models.Carrinho;
import com.listaDeCompra.Lista.de.compras.repository.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {

    private ListaRepository listaRepository;

    @Autowired
    public CarrinhoService(ListaRepository listaRepository){
        this.listaRepository = listaRepository;

    }

    //GET
    public List<Carrinho> listar(){
        return listaRepository.findAll();
    }

    //GETONE
    public Carrinho getCarrinho(Long id){
        return findOrFail(id);
    }

    //POST
    public Carrinho postCarrinho(Carrinho c){
        return listaRepository.save(c);
    }

    //PUT
    public Carrinho putCarrinho(Long id,Carrinho c){
        Carrinho carrinho = findOrFail(id);

        carrinho = c;

        return listaRepository.save(carrinho);
    }

    //DELETE
    public void deletarProduto(Long id){
        Carrinho c = findOrFail(id);
        listaRepository.delete(c);
    }

    //Métodos
    private Carrinho findOrFail(Long id){
        return listaRepository.findById(id).
                orElseThrow(() -> new ProdutoNaoEncontradoException("Produto não encontrado no sistema!"));
    }
}
