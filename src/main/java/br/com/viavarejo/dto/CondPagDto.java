package br.com.viavarejo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CondPagDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4663839706293219923L;

    private BigDecimal vlrEntrada;
    private Integer qtdeParcelas;

    public BigDecimal getVlrEntrada() {
        return vlrEntrada;
    }

    public void setValorEntrada(BigDecimal vlrEntrada) {
        this.vlrEntrada = vlrEntrada;
    }

    public Integer getQtdeParcelas() {
        return qtdeParcelas;
    }

    public void setQtdeParcelas(Integer qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }
}
