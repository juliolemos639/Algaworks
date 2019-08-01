package com.juliolemos.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliolemos.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
