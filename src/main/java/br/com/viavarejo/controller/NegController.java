package br.com.viavarejo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viavarejo.dto.NegDto;
import br.com.viavarejo.dto.ParcelaDto;
import br.com.viavarejo.service.NegService;

@RestController
@RequestMapping("/negociacao")
public class NegController {
    
	@Autowired
	private NegService negService;
	
	@PostMapping("/comprar")
	public List<ParcelaDto> comprar(@RequestBody NegDto negociacao){
	    return negService.comprar(negociacao);
	}
}