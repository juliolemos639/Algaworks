package com.juliolemos.algamoneyapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliolemos.algamoneyapi.model.Lancamento;
import com.juliolemos.algamoneyapi.model.Pessoa;
import com.juliolemos.algamoneyapi.repository.LancamentoRepository;
import com.juliolemos.algamoneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	PessoaService pessoaService;
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaService.buscarPessoaPorCodigo(lancamento.getPessoa().getCodigo());
			
		if (pessoa == null || pessoa.IsInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}

}
