package POO;

public class Pexoa {
	//vamos comesar a dar os atributos pra classe pexoa
	//private outras classes n podem acessar 
	private String firstName;
	private String lastName;
	private String meioName;
	
	//já q são privados, só a classe pexoa pode manipuçar
	//agr vai passar o construtor co msm nome da classe
	//seguido da lista de parametro que vai ter
	public Pexoa (String primeiro, String meio,String ultimo)
	{
		//agr começa a atribuir cada qual aos argumentos
		firstName = primeiro;
		lastName = ultimo;
		meioName = meio;
		//atributo =recebe= argumento//
	}
	// agr vai criar um metodo pra juntar os nomes
	public String getNomeCompleto() //vai pegar o nome completo do usuario
	{
		//criar uma var local tipo string
		String nomeCompleto = firstName + " " + meioName + " " + lastName;
		return nomeCompleto;
		//agr vai instaciar novo objeto, nova pessoa
	}
}
