package com.senaidev.mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.mercado.entities.Produto;
import com.senaidev.mercado.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	//ATRIBUTOS
	@Autowired
	private ProdutoRepository produtoRepository;
	
	//MÉTODOS
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public List<Produto> getAllProdutos(){
		return produtoRepository.findAll();
	}
	
	public Produto GetProdutoById(long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public void deleteProduto(long id) {
		produtoRepository.deleteById(id);
	}
}
