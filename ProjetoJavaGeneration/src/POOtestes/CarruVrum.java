package POOtestes;

public class CarruVrum {
	String cor;
	String modelo;
	double velociadeAtual;
	double velocidadeMaxima;

	// criei 4 atributos da classe carro
	// agr os metodos, primeiro void
	void liga() {
		// s� vai indicar quando o carro estiver ligado
		System.out.println("O carro t� ligado");
		// j� q s� ta indicando uma frase, n precisa retornar nenhum conteudo
	}

	void acelera(double quantidade) {
		// quando acionar o metodo acelera, vai criar/passar uma velocidade nova
		double velocidadeNova = this.velociadeAtual + quantidade;
		// qual atributo vai chamar pro acelera

		this.velociadeAtual = velocidadeNova;
		// assim atualiza
	}

	int pegaMarcha() {
		// vai verificar atraves do la�o, a velocidade atual
		// pra ver se t� menor q 0, ou se t� entre 0 e -40,etc
		if (this.velociadeAtual < 0) {
			// se for menor q zero vai retornar:
			return -1;
		}
		if (this.velociadeAtual >= 0 && this.velociadeAtual < 40) {
			// se isso for verdadeiro vai
			return 1;
		}
		if (this.velociadeAtual >= 40 && this.velociadeAtual < 80) {
			return 2;

		}
		return 3;
	}
}
