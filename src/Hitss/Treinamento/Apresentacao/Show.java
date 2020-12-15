package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("            Hitss Treinamento");
		System.out.println("");
		try {
			Scanner teclado = new Scanner(System.in);
			int num1, num2, num3, num4;
			System.out.println("Digite o 1º número:");
			num1 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 2º número:");
			num2 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 3º número:");
			num3 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 4º número:");
			num4 = teclado.nextInt();
			System.out.println("");
			if (num1 % 2 == 0 && num1 % 3 == 0) {
				System.out.println("O 1º número é divisível por 2 e 3.");
			} else {
				System.out.println("O 1º número não é divisível por 2 e 3.");
			}
			if (num2 % 2 == 0 && num2 % 3 == 0) {
				System.out.println("O 2º número é divisível por 2 e 3.");
			} else {
				System.out.println("O 2º número não é divisível por 2 e 3.");
			}
			if (num3 % 2 == 0 && num3 % 3 == 0) {
				System.out.println("O 3º número é divisível por 2 e 3.");
			} else {
				System.out.println("O 3º número não é divisível por 2 e 3.");
			}
			if (num4 % 2 == 0 && num4 % 3 == 0) {
				System.out.println("O 4º número é divisível por 2 e 3.");
			} else {
				System.out.println("O 4º número não é divisível por 2 e 3.");
			}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
