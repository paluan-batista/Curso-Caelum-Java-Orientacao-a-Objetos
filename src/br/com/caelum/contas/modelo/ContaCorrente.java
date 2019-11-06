package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
	
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		this.saldo -= (valor + 10);
	}
	
	@Override
	public String toString() {
		
		return this.getTitular() + this.getNumero(); 
	}
}
