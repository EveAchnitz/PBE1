package com.senaidev.mercado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_categoria;
	
	@Column(name = "nome")
	private String nome;
	
	//CONSTRUTORES
	public Categoria() {
		
	}
	public Categoria(Long id_categoria, String nome) {
		this.id_categoria = id_categoria;
		this.nome = nome;
	}
	
	//GETTERS E SETTERS
	public Long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
