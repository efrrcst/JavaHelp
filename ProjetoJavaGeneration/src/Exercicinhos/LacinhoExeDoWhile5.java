package Exercicinhos;

import java.util.Scanner;

public class LacinhoExeDoWhile5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		int numerinho = 0, snumerinho = 0;

		do {

			System.out.printf("\nMe diga um número de 1 a 9: ");
			numerinho = ler.nextInt();

			if (numerinho <= 9) {
				System.out.printf("Muito que bem! \n");
				snumerinho = snumerinho + numerinho;

			}
			else {
				System.out.printf(" Ixi, tu colocou um valor errado aê!");
			}
			System.out.println("\nPor enquanto, você acumulou no total: " + snumerinho + " Pointinhos!");

			System.out.printf("\nBora acumular mais? ");

		} while (numerinho < 10);
	}
}
