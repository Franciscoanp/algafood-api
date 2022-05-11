package com.algaworks.algafood.domain.exception;

import java.io.Serializable;

public class ProdutoNaoEncontradoException extends EntidadeNaoEncontradaException implements Serializable {

    public ProdutoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

    public ProdutoNaoEncontradoException(Long restauranteId, Long produtoId) {
        this(String.format("Não existe um cadastro de produto com código %d para o restaurante de código %d",
                produtoId, restauranteId));
    }
}
