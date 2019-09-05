package br.com.viavarejo.model;

import java.io.Serializable;

public class Neg implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6990149474520247984L;
    
    private Produto produto;
    private CondPag condicaoPagamento;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CondPag getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondPag condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

}
