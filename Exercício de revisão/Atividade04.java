package programacao_backend;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o código do primeiro produto? ");
		int cod1 = sc.nextInt();
		
		System.out.print("Quantas peças são? ");
		int qtd1 = sc.nextInt();
		
		System.out.print("Qual o valor de cada peça? ");
		double preco1 = sc.nextDouble();
		
		System.out.print("Agora, qual é o código do segundo produto? ");
		int cod2 = sc.nextInt();
		
		System.out.print("Quantas peças são? ");
		int qtd2 = sc.nextInt();
		
		System.out.print("Qual o valor de cada peça? ");
		double preco2 = sc.nextDouble();
		
		double total = (qtd1 * preco1) + (qtd2 * preco2);
		System.out.printf("O valor total a ser pago é de R$%.2f.", total);
		sc.close();

	}

}
