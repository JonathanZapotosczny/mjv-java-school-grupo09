public class ContaCorrente {

	public int numeroConta;
	
	public void sacar (double valor) {

		if (valor <= saldoConta) {
			saldoConta -= valor;

		} else {
		System.out.println("Saldo Insuficiente");

		}
	}
}