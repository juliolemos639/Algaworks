package com.juliolemos.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliolemos.algamoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
