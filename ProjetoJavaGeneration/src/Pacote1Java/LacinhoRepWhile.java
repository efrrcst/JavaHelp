package Pacote1Java;

import java.util.*;

public class LacinhoRepWhile {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int yearold,ydmaior=0,yxofem=0;
		
		System.out.printf("Me diga, quantos anos vc tem? ");
		yearold = ler.nextInt();
		
		while(yearold>=1)
		{
			System.out.printf("Vc tem: ",yearold);
			if(yearold>=18)
			{
				System.out.printf(" anos. � maior de idade. Vigia!\nSeja respons�vel\n");
				ydmaior++;
				
			}
			else
			{
				System.out.printf(" anos, cuidado, tu � menor de idade!");
				yxofem++;
				
			}			
			System.out.println("\nPassaram aqui: "+ydmaior+ " pessoas vividas!/n");
			System.out.println("\nE tamb�m: "+yxofem+ " pessoas xufen�s!");
			
			System.out.printf("\nMe diga, quantos anos vc tem? ");
			yearold = ler.nextInt();
		}
	}
}
