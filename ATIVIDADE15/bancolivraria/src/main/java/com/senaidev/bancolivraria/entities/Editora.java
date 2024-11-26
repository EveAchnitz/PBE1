package com.senaidev.bancolivraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_editora")
public class Editora {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_editora;
	
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name="cnpj", nullable = false, unique = true, length = 14)
	private String cnpj;
	
	@Column(name="nome_contato", length = 100, nullable = false)
	private String nome_contato;
	
	@Column(name="telefone_contato", length = 13, nullable = false)
	private String telefone_contato;
	
	@Column(name="email", length = 100, nullable = false)
	private String email;
	
	//CONSTRUTORES
	public Editora() {
		
	}
	
	public Editora(Long id_editora, String nome, String cnpj, String nome_contato, String telefone_contato, String email) {
		this.cnpj = cnpj;
		this.email = email;
		this.id_editora = id_editora;
		this.nome = nome;
		this.nome_contato = nome_contato;
		this.telefone_contato = telefone_contato;
	}

	//GETTERS E SETTERS
	public Long getId_editora() {
		return id_editora;
	}

	public void setId_editora(Long id_editora) {
		this.id_editora = id_editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public String getTelefone_contato() {
		return telefone_contato;
	}

	public void setTelefone_contato(String telefone_contato) {
		this.telefone_contato = telefone_contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
