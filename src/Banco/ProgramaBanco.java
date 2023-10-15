package Banco;

public class ProgramaBanco {

	public static void main(String[] args) {
		
		Conta conta1;
		conta1 = new Conta();

		conta1.titular.nome = "Duke";
		conta1.saldo = 1000; 
		
		System.out.println("Saldo atual da conta de " + conta1.titular.nome + " é: R$ " + conta1.saldo);
		
		double saque = 200;
		
		if(conta1.saca(saque)) {
			
			System.out.println(conta1.titular.nome + " sacou R$ " + saque + ", o saldo da conta agora é: R$ " + conta1.saldo);
		}
		else {
			
			System.out.println(conta1.titular.nome + " não conseguir sacar o valor R$ " + saque + ", o saldo da conta é: R$ " + conta1.saldo);
		}
		
		double deposito = 500;
		conta1.deposita(deposito);
		
		System.out.println(conta1.titular.nome + " depositou R$ " + deposito + ", o saldo da conta agora é: R$ " + conta1.saldo);
		
		//Operação com duas contas
		
		Conta conta2;
		conta2 = new Conta();

		conta2.titular.nome = "Ashley";
		conta2.saldo = 780;
		
		System.out.println("Saldo atual da conta de " + conta2.titular.nome + " é: R$ " + conta2.saldo);
		
		double transferencia = 300;
		conta1.transferePara(conta2, transferencia);
		
		System.out.println(conta1.titular.nome + " transfere R$ " + transferencia + " para " + conta2.titular.nome);
		
		System.out.println("Saldo atual da conta de " + conta1.titular.nome + " é: R$ " + conta1.saldo);
		System.out.println("Saldo atual da conta de " + conta2.titular.nome + " é: R$ " + conta2.saldo);
	}
}
