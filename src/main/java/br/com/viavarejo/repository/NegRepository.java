package br.com.viavarejo.repository;

import org.springframework.stereotype.Repository;

import br.com.viavarejo.model.Neg;

@Repository
public class NegRepository {

    public Neg salvar(Neg negociacao) {
        // Persiste o dado no banco!
        return negociacao;
    }
    
}
