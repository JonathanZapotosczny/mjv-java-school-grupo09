public class ContaCorrente {

	public int numeroConta;
	public int numeroAgencia;
    public String nome;
    public boolean contaAtiva;
	
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

        public void cancelarConta(int numeroConta, String justificativa) {


	    if (contaAtiva) {

		    if (saldo > 0.0) {
		
			    System.out.println("A conta nao esta zerada. Favor sacar todo saldo antes de cancelar a conta.");
	
		    }

		    else if (saldo < 0.0) {
		
			    System.out.println("Voce esta em debito com o banco. Favor regularizar sua situacao.");
	
		    }

		    else {
	
			    System.out.printf("Conta cancelada com sucesso.");
			    contaAtiva = false;
		
		    }
	
	    } else {

		    System.out.printf("Conta inativa ou nao encontrada.");
	
	    }

    }
}
