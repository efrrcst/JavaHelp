package Pacote1Java;

import java.util.Scanner;

public class Lcond3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idadee;
		
		System.out.printf("Para saber a turma, digite a idade: ");
		idadee = ler.nextInt();
	
	if (idadee>=10 && idadee<=14)
	{
		System.out.println("Essa � a idade da turma infantil <3");
	}
	else if(idadee>=15 && idadee<=17)
	{
		System.out.println("Caraca! Essa � a idade da turma juvenil uhuu");
	}
	else if(idadee>=18 && idadee<=25)
	{
		System.out.println("Oloco! Com essa idade s� podia ser da turma adulta");
	}
	else if(idadee>=26)
	{
		System.out.println("\nPuts, n�o atendemos p�blico t�o maduro...");
	}
	else if(idadee<=9 && idadee>=1)
	{
		System.out.println("\nPoxa, n�o atendemos crian�as menores de 9 anos...");
	}
	else
	{
		System.out.println("\nOXE! Tu colocasse uma idade estranha a�...");
	}
	}
}
