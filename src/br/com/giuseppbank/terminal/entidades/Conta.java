package br.com.giuseppbank.terminal.entidades;

public class Conta {
	private int numeroAgencia;
	private int numeroConta;
	private String titular;
	private double saldo;
	private TipoConta tipo;

	public Conta(int numeroAgencia, int numeroConta, String titular, TipoConta tipo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.tipo = tipo;
	}
	public Conta(int numeroAgencia, int numeroConta, String titular, double saldo, TipoConta tipo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;
		
	}
	
	public void depositar(double montante) {
		
		if (montante > 0) {
			this.saldo = this.saldo + montante;
		}
	}
	
	public void sacar(double montante) {
		
		if (montante > 0 && montante <= this.saldo) {
			this.saldo = this.saldo - montante;
		}
	}
	
	public double getExtrato() {
		return this.saldo;
	}


	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Conta [numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", titular=" + titular
				+ ", tipo=" + tipo + "]";
	}

}
