package FabricaCarro;

public class Carro {

	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor = new Motor();
	
	//Liga o carro
	void liga() {
		
		System.out.println("O carro está ligado");
	}
	
	//Acelera uma certa quantidade
	void acelera(double quantidade) {
		
		this.velocidadeAtual += quantidade;
	}
	
	//Devolve a marcha do carro
	int pegaMarcha() {
		
		if(this.velocidadeAtual < 0) {
			
			return -1;
		}
		
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			
			return 1;
		}
		
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			
			return 2;
		}
		
		return 3;
	}
}
