package programacao_backend;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite um outro número inteiro: ");
		int n2 = sc.nextInt();
		
		int soma = n1+n2;
		System.out.println("A soma desses valores é "+ soma + ".");
		
		sc.close();

	}

}
