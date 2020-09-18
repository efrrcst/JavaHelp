package Pacote1Java;

public class LacinhoRep1 {
	public static void main (String args[])
	{
		int aiai,mais=0;
		
		for(aiai=1;aiai<=10;aiai++)
		{
			System.out.printf("\n %d",aiai);
			/* %d chama um valor inteiro*/
			mais = mais + aiai;
		}
		System.out.printf("\nSomando tudo: %d",mais);
	}
}
