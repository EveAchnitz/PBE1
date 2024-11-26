package com.senaidev.bancolivraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_livro")
public class Livro {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_livro;
	
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name="isbn", length = 13, nullable = false, unique = true)
	private String isbn;
	
	@Column(name="categoria", length = 100, nullable = false)
	private String categoria;
	
	@Column(name="estoque")
	private int estoque;
	
	@ManyToOne
	@JoinColumn(name="AUTOR_id_autor")
	private Autor autor;
	
	@ManyToOne
	@JoinColumn(name="EDITORA_id_editora")
	private Editora editora;
	
	//CONSTRUTORES
	public Livro() {
		
	}
	
	public Livro(Long id_livro, String nome, String isbn, String categoria, int estoque) {
		this.id_livro = id_livro;
		this.nome = nome;
		this.isbn = isbn;
		this.categoria = categoria;
		this.estoque = estoque;
	}

	//GETTERS E SETTERS
	public Long getId_livro() {
		return id_livro;
	}

	public void setId_livro(Long id_livro) {
		this.id_livro = id_livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
}
