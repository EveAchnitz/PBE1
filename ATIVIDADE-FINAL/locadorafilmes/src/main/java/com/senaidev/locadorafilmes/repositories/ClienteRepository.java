package com.senaidev.locadorafilmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.locadorafilmes.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
