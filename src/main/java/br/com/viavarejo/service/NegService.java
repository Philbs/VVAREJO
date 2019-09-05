package br.com.viavarejo.service;

import java.util.List;

import br.com.viavarejo.dto.NegDto;
import br.com.viavarejo.dto.ParcelaDto;

public interface NegService {

    List<ParcelaDto> comprar(NegDto negociacao);
    
}
