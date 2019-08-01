package com.juliolemos.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliolemos.algamoneyapi.model.Lancamento;
import com.juliolemos.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
