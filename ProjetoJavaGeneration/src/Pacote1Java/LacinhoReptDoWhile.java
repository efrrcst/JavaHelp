package Pacote1Java;

import java.util.*;

public class LacinhoReptDoWhile {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int yearold,ydmaior=0,yxofem=0;
		

		
		do
		{
			System.out.printf("Me diga, quantos anos vc tem? ");
			yearold = ler.nextInt();
			
			System.out.printf("Vc tem: ",yearold);
			if(yearold>=18)
			{
				System.out.printf(" anos. É maior de idade. Vigia!\nSeja responsável\n");
				ydmaior++;
				
			}
			else
			{
				System.out.printf(" anos, cuidado, tu é menor de idade!");
				yxofem++;
				
			}			
			System.out.println("\nPassaram aqui: "+ydmaior+ " pessoas vividas!/n");
			System.out.println("\nE também: "+yxofem+ " pessoas xufenís!");
			
			System.out.printf("\nMe diga, quantos anos vc tem? ");
			yearold = ler.nextInt();
		}while(yearold>=1);
	}
}
