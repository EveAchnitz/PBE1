package prjCaneta;

import java.util.Scanner;

public class Aplicacao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Livro livro01 = new Livro("Alice no país das maravilhas","Lewis Carrol");
		Livro livro02 = new Livro("Quarto de despejo","Carolina Maria de Jesus");
		
		System.out.println("Livros disponíveis: ");
		System.out.print("1. ");
		livro01.status();
		System.out.print("2. ");
		livro02.status();
		
		System.out.println("Qual livro você deseja alugar?");
		int escolha = sc.nextInt();
	}

}
