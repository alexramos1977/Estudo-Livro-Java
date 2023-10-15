package Banco;

public class Conta {

	int numero;
	double saldo;
	Cliente titular = new Cliente();
	
	boolean saca(double valor) {
		
		if(this.saldo < valor) {
			
			return false;
		}
		else {
			
			//double novoSaldo = this.saldo - quantidade;
			//this.saldo = novoSaldo;
			this.saldo -= valor;
			
			return true;
		}
	}
	
	void deposita(double quantidade) {
		
		this.saldo += quantidade;
	}
	
	boolean transferePara(Conta destino, double valor) {
		
		boolean retirou = this.saca(valor);
		
		if(retirou == false) {
			
			return false;
		}
		else {
			
			destino.deposita(valor);
			
			return true;
		}
	}
}
