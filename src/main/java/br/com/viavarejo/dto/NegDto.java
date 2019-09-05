package br.com.viavarejo.dto;

import java.io.Serializable;

public class NegDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1422922463064713706L;

    private ProdutoDto produto;
    private CondPagDto condicaoPagamento;

    public ProdutoDto getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDto produto) {
        this.produto = produto;
    }

    public CondPagDto getCondPag() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondPagDto condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

}
