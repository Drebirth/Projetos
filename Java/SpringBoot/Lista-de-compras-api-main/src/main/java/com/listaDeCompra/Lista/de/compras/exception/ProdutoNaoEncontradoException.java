package com.listaDeCompra.Lista.de.compras.exception;

public class ProdutoNaoEncontradoException extends RegraException {
    private static final long serialVersionUID = 1L;

    public ProdutoNaoEncontradoException(String message){
        super(message);
    }

}
