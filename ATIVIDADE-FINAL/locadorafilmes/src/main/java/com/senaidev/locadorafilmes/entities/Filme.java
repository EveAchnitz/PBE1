package com.senaidev.locadorafilmes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_filme")
public class Filme {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFilme;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "genero", nullable = false)
	private String genero;
	
	@Column(name = "classIndicativa")
	private int classIndicativa;
	
	@Column(name = "preco", nullable = false)
	private double preco;
	
	//CONSTRUTORES
	public Filme() {
		
	}
	public Filme(Long idFilme, String nome, String genero, int classIndicativa, double preco) {
		this.classIndicativa = classIndicativa;
		this.genero = genero;
		this.idFilme = idFilme;
		this.nome = nome;
		this.preco = preco;
	}
	
	//GETTERS E SETTERS
	public Long getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(Long idFilme) {
		this.idFilme = idFilme;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getClassIndicativa() {
		return classIndicativa;
	}
	public void setClassIndicativa(int classIndicativa) {
		this.classIndicativa = classIndicativa;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
