package ax01Banco;

public class ProgramaBanco {

	public static void main(String[] args) {
		
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		
		Conta conta1;
		conta1 = new Conta();
		
		System.out.println("Total de contas: " + Conta.getTotalDeContas());

		conta1.titular.setNome("Duke");
		conta1.deposita(1000);
		
		System.out.println("Saldo atual da conta de " + conta1.titular.getNome() + " é: R$ " + conta1.getSaldo());
		
		double saque = 200;
		
		if(conta1.saca(saque)) {
			
			System.out.println(conta1.titular.getNome() + " sacou R$ " + saque + ", o saldo da conta agora é: R$ " + conta1.getSaldo());
		}
		else {
			
			System.out.println(conta1.titular.getNome() + " não conseguir sacar o valor R$ " + saque + ", o saldo da conta é: R$ " + conta1.getSaldo());
		}
		
		double deposito = 500;
		conta1.deposita(deposito);
		
		System.out.println(conta1.titular.getNome() + " depositou R$ " + deposito + ", o saldo da conta agora é: R$ " + conta1.getSaldo());
		
		//Operação com duas contas
		
		Conta conta2;
		conta2 = new Conta();
		
		System.out.println("Total de contas: " + Conta.getTotalDeContas());

		conta2.titular.setNome("Ashley");
		conta2.deposita(780);
		
		System.out.println("Saldo atual da conta de " + conta2.titular.getNome() + " é: R$ " + conta2.getSaldo());
		
		double transferencia = 300;
		conta1.transferePara(conta2, transferencia);
		
		System.out.println(conta1.titular.getNome() + " transfere R$ " + transferencia + " para " + conta2.titular.getNome());
		
		System.out.println("Saldo atual da conta de " + conta1.titular.getNome() + " é: R$ " + conta1.getSaldo());
		System.out.println("Saldo atual da conta de " + conta2.titular.getNome() + " é: R$ " + conta2.getSaldo());
	}
}
