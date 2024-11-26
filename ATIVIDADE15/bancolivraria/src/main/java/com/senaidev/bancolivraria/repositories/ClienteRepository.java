package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.bancolivraria.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findByCpf(String cpf);
}
