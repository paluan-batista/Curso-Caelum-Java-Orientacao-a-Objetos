package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as Contas do Banco
 * 
 * @author Paluan Batista da Silva
 *
 */
abstract public class Conta implements Comparable<Conta> {
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		} else {
			saldo -= valor;
		}
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			saldo += valor;
		}
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

//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return false;
//		}
//		Conta outraConta = (Conta) obj;
//		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
//	}

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

}
