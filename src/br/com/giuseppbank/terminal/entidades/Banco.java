package br.com.giuseppbank.terminal.entidades;

import java.util.ArrayList;

public class Banco {
	
	private Funcionario gerente;
	private String endereco;
	private ArrayList<Conta> contas = new ArrayList<> () ;
	
	public Banco(Funcionario gerente, String endereco) {
		this.gerente = gerente;
		this.endereco = endereco;
	}
	
	public void abrirConta(Conta novaConta) {
		if (novaConta != null) {
			contas.add(novaConta);
		}
	}
	
	public Conta pesquisarContaNumero(int numeroConta) {
		
		Conta contaPesquisada = null;
		
		for (Conta contaTemp : contas) {
			
			if(contaTemp.getNumeroConta() == numeroConta) {
				contaPesquisada = contaTemp;
				break;
			}
			
		}
		return contaPesquisada;
	}
	
	public void removerConta(Conta contaParaRemover) {
		contas.remove(contaParaRemover);
	}

	
	public void listarContas() {
		if(contas.isEmpty()) {
			System.out.println("Não existem contas a serem exibidas");
	}	else {
			System.out.println("Lista de contas do GiuseppBank \n");
			for (Conta conta : contas) {
				System.out.println("Titular: " + conta.getTitular() + " Número da Conta: " + conta.getNumeroConta());
			}
			
		}
	}

	public Funcionario getGerente() {
		return gerente;
	}

	public void setGerente(Funcionario gerente) {
		this.gerente = gerente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}
	
}
