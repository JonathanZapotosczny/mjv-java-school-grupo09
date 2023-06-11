public class ContaCorrente {
  
	public int numeroConta;
	public int numeroAgencia;
	public String nome;
  	public double saldoConta;
	public LocalDate dataNascimento;
	
	public void sacar (double valor) {

	}

	public void depositar (double valor) {

	}

	public void transferir (double valor, ContaCorrente outraConta) {

	}

	public void cancelarConta (int numeroConta, String justificativa) {
	
	}

	public void consultarExtrato (LocalDate dataInicial, LocalDate dataFinal) {

	}
          
   	public double consultarSaldoAtual() {
      		return saldoConta;
   	}

}