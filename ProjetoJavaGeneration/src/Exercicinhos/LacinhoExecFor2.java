package Exercicinhos;

import java.util.*;

public class LacinhoExecFor2 {
	public static void main(String args[])
	{
		int numzin,numzinpar=0,numzinimpar=0,lupin;
		Scanner ler = new Scanner(System.in);
		
		for (lupin = 1; lupin <= 10; lupin++)
		{	
				System.out.println("Coloca um numerozinho ae: ");
				numzin = ler.nextInt();
				
				if(numzin % 2 ==0)
				{
					numzinpar++;
				}
				else
				{
					numzinimpar++;
				}
		}

		System.out.println("\nTemos: "+numzinpar+ " númerinhos parex!");
		System.out.println("\nTemos: "+numzinimpar+ " númerinhos ímparexx!");
	}
}
