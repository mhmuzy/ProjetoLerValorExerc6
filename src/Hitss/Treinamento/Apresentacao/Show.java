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
			System.out.println("Digite o 1� n�mero:");
			num1 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 2� n�mero:");
			num2 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 3� n�mero:");
			num3 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 4� n�mero:");
			num4 = teclado.nextInt();
			System.out.println("");
			if (num1 % 2 == 0 && num1 % 3 == 0) {
				System.out.println("O 1� n�mero � divis�vel por 2 e 3.");
			} else {
				System.out.println("O 1� n�mero n�o � divis�vel por 2 e 3.");
			}
			if (num2 % 2 == 0 && num2 % 3 == 0) {
				System.out.println("O 2� n�mero � divis�vel por 2 e 3.");
			} else {
				System.out.println("O 2� n�mero n�o � divis�vel por 2 e 3.");
			}
			if (num3 % 2 == 0 && num3 % 3 == 0) {
				System.out.println("O 3� n�mero � divis�vel por 2 e 3.");
			} else {
				System.out.println("O 3� n�mero n�o � divis�vel por 2 e 3.");
			}
			if (num4 % 2 == 0 && num4 % 3 == 0) {
				System.out.println("O 4� n�mero � divis�vel por 2 e 3.");
			} else {
				System.out.println("O 4� n�mero n�o � divis�vel por 2 e 3.");
			}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
