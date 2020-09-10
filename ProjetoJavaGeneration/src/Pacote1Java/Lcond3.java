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
		System.out.println("Essa é a idade da turma infantil <3");
	}
	else if(idadee>=15 && idadee<=17)
	{
		System.out.println("Caraca! Essa é a idade da turma juvenil uhuu");
	}
	else if(idadee>=18 && idadee<=25)
	{
		System.out.println("Oloco! Com essa idade só podia ser da turma adulta");
	}
	else if(idadee>=26)
	{
		System.out.println("\nPuts, não atendemos público tão maduro...");
	}
	else if(idadee<=9 && idadee>=1)
	{
		System.out.println("\nPoxa, não atendemos crianças menores de 9 anos...");
	}
	else
	{
		System.out.println("\nOXE! Tu colocasse uma idade estranha aí...");
	}
	}
}
