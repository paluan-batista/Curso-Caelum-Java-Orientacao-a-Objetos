package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as Contas do Banco
 * @author Paluan Batista da Silva
 *
 */
abstract public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;

	public void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	abstract public String getTipo();
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	@Override
	public String toString() {
		
		return "[Titular=" + titular + ", Nº =" + numero + ",Ag=" + agencia + "]";
	}

}
