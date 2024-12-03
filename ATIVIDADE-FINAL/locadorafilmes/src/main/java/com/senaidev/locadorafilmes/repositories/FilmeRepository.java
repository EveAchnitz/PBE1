package com.senaidev.locadorafilmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.locadorafilmes.entities.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
