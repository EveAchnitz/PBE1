package programacao_backend;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o seu número de funcionário? ");
		int numero = sc.nextInt();
		
		System.out.print("Quantas horas você trabalha por dia? ");
		int horas = sc.nextInt();
		
		System.out.print("E quanto você recebe por hora? ");
		double porhora = sc.nextDouble();
		
		double salario = horas * porhora;
		System.out.printf("O salário do funcionário de número %d é R$%.2f por dia.", numero, salario);
		
		sc.close();

	}

}
