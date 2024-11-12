package com.senaidev.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.mercado.entities.Produto;
import com.senaidev.mercado.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	//ATRIBUTOS
	@Autowired
	private ProdutoService produtoService;
	
	//MÉTODOS
	@PostMapping
	public Produto createProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}
	
	@GetMapping
	public List<Produto> getAllProdutos(){
		return produtoService.getAllProdutos();
	}
	
	@GetMapping("/{id}")
	public Produto getProdutoById(@PathVariable long id) {
		return produtoService.GetProdutoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable long id) {
		produtoService.deleteProduto(id);
	}
}
