package lingprog2.lista01.questao18;

public class Conta implements Tributavel {
	
	private double saldo;        	// saldo corrente
	private double saldoMinimo;  	// saldo mínimo (saldo atual não pode ser inferior a este saldo)
	private double totalTributos;   // tributos acumulados com operações de saque e depósito

	// método construtor de inicialização de saldo mínimo
	public Conta(double saldoMinimo) {
		this.saldo = 0;        		// inicialização de saldo atual (corrente) com 0 (zero)
		this.saldoMinimo = saldoMinimo;
	}

	// retorno de valor atual do saldo mínimo
	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	// atualização de valor atual do saldo mínimo
	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	// retorno de valor atual do saldo corrente
	public double getSaldo() {
		return saldo;
	}

	// operação de registro de depósito em conta, com atualização de saldo corrente
	public void depositar(double deposito) {
		// cálculo de tributação de depósito considerando percentual de 1%
		double tributoDeposito = deposito * 1d / 100d;
		
		// atualização de saldo de conta acrescentando-se valor de depósito e
		// deduzindo-se valor tributado deste mesmo depósito
		saldo += (deposito - tributoDeposito);
		
		// atualização de total de tributos com operações de saque e depósito
		totalTributos += tributoDeposito;
	}

	// operação de registro de saque em conta, com atualização de saldo corrente
	public void sacar(double saque) throws Exception {
		// cálculo de tributação de saquel considerando percentual de 1%
		double tributoSaque = saque * 1d / 100d;
		
		// saldo atualizado previsto após dedução de saque e de tributação sobre este saque
		double saldoAtualizado = saldo - (saque + tributoSaque);
		
		// verificação de previsão de saldo atualizado abaixo de ao saldo mínimo
		if (saldoAtualizado < saldoMinimo) {
			// lançamento de exceção se saldo abaixo de saldo mínimo
			throw new Exception("Tentativa de realização de saque que implique em saldo inferior ("
								+ saldoAtualizado + ") ao saldo mínimo de " + saldoMinimo + "...");			
		}
		else {
			// efetiva atualização de saldo da conta
			saldo = saldoAtualizado;
			
			// atualização de total de tributos com operações de saque e depósito
			totalTributos += tributoSaque;
		}
	}

	// retorno de tributos arrecadados com operações de saque e depósito
	public double calcularTributos() {
		return totalTributos;
	}
	
}