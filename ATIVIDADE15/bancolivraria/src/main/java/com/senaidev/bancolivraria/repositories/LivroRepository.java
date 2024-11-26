package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.bancolivraria.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	Livro findByIsbn(String isbn);
}
