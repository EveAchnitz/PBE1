package programacao_backend;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o valor do raio círculo? ");
		double raio = sc.nextDouble();
		
		double area = 3.14159 * (raio*raio);
		System.out.printf("A área do círculo apresentado é de %.4f.", area);
		
		sc.close();

	}

}
