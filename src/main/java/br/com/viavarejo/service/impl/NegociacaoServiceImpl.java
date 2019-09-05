package br.com.viavarejo.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.viavarejo.converter.NegConv;
import br.com.viavarejo.dto.NegDto;
import br.com.viavarejo.dto.ParcelaDto;
import br.com.viavarejo.exception.ValiDException;
import br.com.viavarejo.model.CondPag;
import br.com.viavarejo.model.Neg;
import br.com.viavarejo.model.Produto;
import br.com.viavarejo.repository.NegRepository;
import br.com.viavarejo.service.NegService;

@Service
public class NegociacaoServiceImpl implements NegService {

    private static final BigDecimal TAXA_JUROS = new BigDecimal("34.5");
    private static final Integer PARCELA_COM_JUROS = 6;
    
    @Autowired
    private NegRepository repository;

    @Override
    public List<ParcelaDto> comprar(NegDto negociacaoDto) {

        validar(negociacaoDto);

        final Neg negociacao = NegConv.toEntity(negociacaoDto);
        final Produto produto = negociacao.getProduto();
        final CondPag condPag = negociacao.getCondicaoPagamento();
        
        repository.salvar(negociacao);

        List<ParcelaDto> parcelas = new ArrayList<>();
        BigDecimal juros = condPag.getQtdeParcelas() > PARCELA_COM_JUROS ? TAXA_JUROS : BigDecimal.ZERO;
        BigDecimal valorDescontaEntrada = produto.getValor().subtract(condPag.getValorEntrada());
        BigDecimal valorParcela = valorDescontaEntrada.divide(BigDecimal.valueOf(condPag.getQtdeParcelas()), 2, RoundingMode.HALF_UP);

        for (int i = 1; i <= condPag.getQtdeParcelas(); i++) {
            ParcelaDto parcela = new ParcelaDto();
            parcela.setNumeroParcela(i);
       if (i > 6 ) {
            parcela.setTaxaJurosAoMes(juros);
            parcela.setValor(juros.equals(BigDecimal.ZERO) ? valorParcela : valorParcela.multiply(juros));
            parcelas.add(parcela);
        }
        }
        

        return parcelas;
    }

    private void validar(NegDto negociacaoDto) {
        
        if (negociacaoDto.getCondPag() == null) {
            throw new ValiDException("Condição de Pagamento obrigatório!");
        }
        
        if (negociacaoDto.getProduto() == null) {
            throw new ValiDException("Produto obrigatório!");
        }
        
        if (negociacaoDto.getCondPag().getQtdeParcelas() == null || negociacaoDto.getCondPag().getQtdeParcelas() <= 0) {
            throw new ValiDException("Quantidade de parcelas obrigatório!");
        }
        
        if (negociacaoDto.getProduto().getCodigo() == null || negociacaoDto.getProduto().getCodigo() <= 0) {
            throw new ValiDException("Código do produto obrigatório!");
        }
        
        if (negociacaoDto.getProduto().getValor() == null || negociacaoDto.getProduto().getValor().equals(BigDecimal.ZERO)) {
            throw new ValiDException("Valor do produto obrigatório!");
        }
    }
}
