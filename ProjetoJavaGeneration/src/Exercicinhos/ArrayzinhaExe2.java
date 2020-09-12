package Exercicinhos;

import java.util.Scanner;

public class ArrayzinhaExe2 {
	public static void main(String[] args)
		{
		Scanner entrada = new Scanner(System.in);

		int arrayNumzin[] = new int[6], somepar = 0, contimparzin = 0, x;
		Scanner ler = new Scanner(System.in);
		for (x = 0; x < 6; x++)
			{
			System.out.println(" Entre com um número: ");
			arrayNumzin[x] = ler.nextInt();

			if (arrayNumzin[x] % 2 == 0) {
				somepar = somepar + arrayNumzin[x];
				System.out.println("\nEsse número é parzinho: " + arrayNumzin[x]);
			} else {
				contimparzin++;
				System.out.println("\nEsse número é ímparzinho: " + arrayNumzin[x]);
				}
				}
		System.out.println("\nO total de todos os números pares foi de: " + somepar);
		System.out.println("\nTotalizando, o resultado dos números impares foi de : " + contimparzin);

	}
}
