package prjCaneta;

public class Livro {
	
	String nomeLivro;
	String nomeAutor;
	boolean alugado;
	
	public Livro (String livro, String autor) {
		this.nomeLivro = livro;
		this.nomeAutor = autor;
		this.alugado = false;
	}
	
	void status() {
		System.out.println(this.nomeLivro + ": "+ (this.alugado ? "Alugado":"Disponível"));
	}
	void alugar() {
		this.alugado = true;
	}
	
	void devolver() {
		this.alugado = false;
	}

}
