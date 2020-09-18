package POOtestes;

public class TesteCarruVrum {
	public static void main (String args[])
	{
		CarruVrum meuCarru = new CarruVrum();
		//agr vai colocar algumas caracteristicas do carru
		meuCarru.cor = "Azul Neon";
		meuCarru.modelo = "Palio mil grau";
		meuCarru.velociadeAtual = 0;
		meuCarru.velocidadeMaxima = 80;
		
		//instanciei todos os atributos
		//agr vou chamar meus metodos
		
		meuCarru.liga();
		//ligou o carru
		
		meuCarru.acelera(20);
		System.out.println(meuCarru.velociadeAtual);
	}
}
