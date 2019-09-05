package br.com.viavarejo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.viavarejo.dto.CondPagDto;

public class CondPag implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1443224358053839558L;
    
    private BigDecimal valorEntrada;
    private Integer qtdeParcelas;

    public CondPag() {
        
    }
    
    public CondPag(CondPagDto condicaoPagamentoDto) {
        this.valorEntrada = condicaoPagamentoDto.getVlrEntrada();
        this.qtdeParcelas = condicaoPagamentoDto.getQtdeParcelas();
    }
    
    public BigDecimal getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(BigDecimal valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Integer getQtdeParcelas() {
        return qtdeParcelas;
    }

    public void setQtdeParcelas(Integer qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }
}
