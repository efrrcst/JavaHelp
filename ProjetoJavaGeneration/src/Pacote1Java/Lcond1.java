package Pacote1Java;

import java.util.*;


public class Lcond1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a;
		int b;
		int c;		
		
		
		System.out.printf("Entre com o primeiro valorr: ");
		a = ler.nextInt();
		
		System.out.println("Agora, entre com o segundo valorr: ");
		b = ler.nextInt();
		System.out.println("E por fim, o terceiro valor: ");
		c = ler.nextInt();
		
		if (a>=b && a>=c)
		{
			System.out.println("O 1º foi seu maior valor!");
		}
		else if(b>=a && b>=c)
		{
			System.out.println("O 2º foi seu maior valor, uhu!");
		}
		else if(c>=a && c>=b)
		{
			System.out.println("O 3º foi seu maior valoor!");
		}
		else
		{
			System.out.println("\nOLOCO BIXO! UM ERRO AQUI!");
		}
	}
}