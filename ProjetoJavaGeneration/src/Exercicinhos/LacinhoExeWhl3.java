package Exercicinhos;

import java.util.*;

public class LacinhoExeWhl3 {
	public static void main(String args[]) {
		int yearold = 0, ydmaior=0,yxofem=0;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Me diga, quantoss anos vc tem?");
		yearold = ler.nextInt();
		
		while (yearold >= 1) {
			System.out.printf("Vc tem: %d ", yearold);
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
