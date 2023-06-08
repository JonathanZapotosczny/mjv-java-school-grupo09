public class ContaCorrente {

	public int numeroConta;
	public int numeroAgencia;
    	public String nome;
    	public boolean contaAtiva;
	LocalDate dataNascimento;
	
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

	public void consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {
		
		int dia = 0;

        	System.out.println("===================================");
        	System.out.printf("Cliente: %s \n", nome);
        	System.out.printf("Agencia: %d \n", numeroAgencia);
        	System.out.printf("Conta: %d \n", numeroConta);

        	while(!dataInicial.isEqual(dataFinal)) {

            		System.out.printf("Data: %s Saldo: %.2f", dataInicial, saldo);

            		dia++;
            		dataInicial.plusDays(dia);
        	}

        	System.out.println("===================================");

	}

    }
}
