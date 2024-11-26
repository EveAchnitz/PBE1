package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Pedido;
import com.senaidev.bancolivraria.repositories.PedidoRepository;

@Service
public class PedidoService {

	//ATRIBUTOS
	@Autowired
	private PedidoRepository pedidoRepository;
	
	//MÉTODOS
	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public List<Pedido> getAllPedidos() {
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedidoById(Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}
	
	public void deletePedido(Long id) {
		pedidoRepository.deleteById(id);
	}
}
