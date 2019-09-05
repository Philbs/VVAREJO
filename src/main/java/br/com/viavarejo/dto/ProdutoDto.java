package br.com.viavarejo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProdutoDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1247125140391672721L;
    
    private Long cod;
    private String nome;
    private BigDecimal valor;

    public Long getCodigo() {
        return cod;
    }

    public void setCodigo(Long codigo) {
        this.cod = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
