package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.senaidev.bancolivraria.entities.Editora;

public interface EditoraRepository extends JpaRepository<Editora, Long>{
	Editora findByCnpj(String cnpj);
}
