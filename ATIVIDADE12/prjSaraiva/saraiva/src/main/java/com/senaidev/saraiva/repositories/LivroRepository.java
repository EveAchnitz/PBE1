package com.senaidev.saraiva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.saraiva.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
