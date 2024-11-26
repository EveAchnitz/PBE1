package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.bancolivraria.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
