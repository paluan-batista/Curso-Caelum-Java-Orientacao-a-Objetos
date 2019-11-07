package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {

	private double valor;
	private String Titular;
	private int numeroApolice;
	
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	
	public double getValorImposto() {
		
		return 42 + this.valor * 0.02;
	}
	
	public String getTipo() {
		return "Seguro de Vida";
	}

	

}
