package com.senaidev.bancolivraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_autor")
public class Autor {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_autor;
	
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name="email", length = 100, nullable = false)
	private String email;
	
	//CONSTRUTORES
	public Autor() {
		
	}
	
	public Autor(Long id_autor, String nome, String email) {
		this.id_autor = id_autor;
		this.nome = nome;
		this.email = email;
	}

	//GETTERS E SETTERS
	public Long getId_autor() {
		return id_autor;
	}

	public void setId_autor(Long id_autor) {
		this.id_autor = id_autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
