package br.com.viavarejo.converter;

import br.com.viavarejo.dto.NegDto;
import br.com.viavarejo.model.CondPag;
import br.com.viavarejo.model.Neg;
import br.com.viavarejo.model.Produto;

public class NegConv {

    private NegConv() {
        
    }

    public static Neg toEntity(NegDto dto) {
        Neg entity = new Neg();
        entity.setCondicaoPagamento(new CondPag(dto.getCondPag()));
        entity.setProduto(new Produto(dto.getProduto()));
        return entity;
    }
}
