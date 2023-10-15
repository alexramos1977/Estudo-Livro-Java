package FabricaCarro;

public class ProgramaCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.cor = "Verde";
		carro1.modelo = "Fusca";
		carro1.velocidadeAtual = 0;
		carro1.velocidadeMaxima = 80;
		
		//Liga o carro
		carro1.liga();
		
		//Acelera o carro
		carro1.acelera(20);
		System.out.println(carro1.velocidadeAtual);
	}
}
