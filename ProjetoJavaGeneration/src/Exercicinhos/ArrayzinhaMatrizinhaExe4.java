package Exercicinhos;

import java.util.Scanner;

public class ArrayzinhaMatrizinhaExe4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		//n�o d� pra usar array vazia, para de ser doida
		
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matrizSoma[][] = new float[2][2], constante;
		float matrizSubtrai[][] = new float[2][2];
		int op;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Entre com o valor da matriz1: ");
				matriz1[i][j] = ler.nextFloat();
				System.out.println("Entre com o valor da matriz2: ");
				matriz2[i][j] = ler.nextFloat();
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
				matrizSubtrai[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}

		System.out.println("Aten��es, leia o n�mero de uma constante: ");
		constante = ler.nextFloat();

		System.out.println("\nMenu de las op�ionxs");
		System.out.println("\n1- Somar as duas matrizxs ");
		System.out.println("\n2- Subtrair a primeira matrxz da segunda ");
		System.out.println("\n3- Adicionar uma constante as duas matrizxs");
		System.out.println("\n4- Imprimir as matrizxs ");
		System.out.println("\n5- Sair desse sistema logo oxe! ");
		System.out.println("\nDigite a sua op��o: ");
		op = ler.nextInt();
		do {
			if (op == 5) {
				System.out.println("Valeu de cora��o por utilizar o nosso sistemitcho, tmj !");
			} else {
				switch (op) {
				case 1:
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 2; j++) {
							System.out.println("\nSominha: " + matrizSoma[i][j]);
						}
					}
					break;
				case 2:
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 2; j++) {
							System.out.println("\nSubtra��ozinha: " + matrizSubtrai[i][j]);
						}
					}
					break;
				case 3:
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 2; j++) {
							matriz1[i][j] = matriz1[i][j] + constante;
							matriz2[i][j] = matriz2[i][j] + constante;
							System.out.println("Matrxz1: " + matriz1[i][j]);
							System.out.println("Matrxz2: " + matriz2[i][j]);
						}
					}
					break;
				case 4:
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 2; j++) {

							System.out.println("Matrxz1: " + matriz1[i][j]);
							System.out.println("Matrxz2: " + matriz2[i][j]);
						}
					}
					break;

				default:
					System.out.println("Tem alguma coisa errada que tu colocou a�...");

				}

				System.out.println("\nMenu de op��es");
				System.out.println("\n1- Somar as duas matrizxs ");
				System.out.println("\n2- Subtrair a primeira matrxz da segunda ");
				System.out.println("\n3- Adicionar uma constante as duas matrizxs");
				System.out.println("\n4- Imprimir as matrizxs ");
				System.out.println("\n5- Sair desse negocio, cansei u.u ");
				System.out.println("\nDigite a sua op��o ent�o, oshe: ");
				op = ler.nextInt();
			}

		} while (op != 5);
	}

	//rever anota��es do caderno - texto vermelho - cobrinha ^^^^^^^^^^^^
}