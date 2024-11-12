package com.senaidev.mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.mercado.entities.Categoria;
import com.senaidev.mercado.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	//ATRIBUTOS
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	//MÉTODOS
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public List<Categoria> getAllCategorias(){
		return categoriaRepository.findAll();
	}
	
	public Categoria getCategoriaById(long id) {
		return categoriaRepository.findById(id).orElse(null);
	}
	
	public void deleteCategoria(long id) {
		categoriaRepository.deleteById(id);
	}
}
