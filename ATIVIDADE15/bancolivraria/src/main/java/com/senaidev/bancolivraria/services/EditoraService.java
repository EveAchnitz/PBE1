package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Editora;
import com.senaidev.bancolivraria.repositories.EditoraRepository;

@Service
public class EditoraService {

	//ATRIBUTOS
	@Autowired
	private EditoraRepository editoraRepository;
	
	//MÉTODOS
	public Editora saveEditora(Editora editora) {
		return editoraRepository.save(editora);
	}
	
	public List<Editora> getAllEditoras() {
		return editoraRepository.findAll();
	}
	
	public Editora getEditoraById(Long id) {
		return editoraRepository.findById(id).orElse(null);
	}
	
	//Buscar pelo CNPJ
	public Editora getEditoraByCnpj(String cnpj) {
		return editoraRepository.findByCnpj(cnpj);
	}
	
	public void deleteEditora(Long id) {
		editoraRepository.deleteById(id);
	}
}
