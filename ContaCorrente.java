public class ContaCorrente {

	public int numeroConta;
	public int numeroAgencia;
	
	public void sacar (double valor) {

		if (valor <= saldoConta) {
			saldoConta -= valor;

		} else {
		System.out.println("Saldo Insuficiente");

		}
	}

	public boolean transferir(double valor, ContaCorrente outraConta){
		if(this.saldoConta >= valor){
			this.saldoConta = this.saldoConta -valor;

			outraConta.saldoConta = outraConta.saldoConta + valor;

		}else{

		System.out.println("Saldo Insuficiente");

		}

	}
}
