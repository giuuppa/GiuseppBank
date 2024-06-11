package br.com.giuseppbank.terminal.principal;
import java.util.Scanner;

import br.com.giuseppbank.terminal.entidades.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario gerenteSouza = new Funcionario(1, 12000,"Souza",CargoFuncionario.GERENTE);
		Banco giuseppBank = new Banco(gerenteSouza,"Rua ceara");
		
		//TODO para remover dps dos testes
		//Conta contaGiupa = new Conta(1,123,"Giusepp",TipoConta.CONTA_CORRENTE);
		//Conta contaGiupa2 = new Conta(1,123,"Gabriel",TipoConta.CONTA_POUPANÇA);
		//giuseppBank.abrirConta(contaGiupa);
		//giuseppBank.abrirConta(contaGiupa2);
		
		int opcao = 1;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("\nGiuseppBank \nOpções \n 1.Listar 2.Adcionar 3.Pesquisa por numero 4.Encerra por número 5.Sair" );
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				giuseppBank.listarContas();
			}else if(opcao == 2) {
				System.out.println("Digite o número da Agencia: ");
				int numeroAgencia = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o número da Conta: ");
				int numeroConta = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o nome do Titular: ");
				String titular = sc.nextLine();
				
				TipoConta tipo;
				System.out.println("Digite o Tipo da Conta (1 para Conta Corrente, 2 para Conta Poupança): ");
				int tipoConta = sc.nextInt();
				sc.nextLine();
				
				if(tipoConta == 1) {
					tipo = TipoConta.CONTA_CORRENTE;
				} else if (tipoConta == 2) {
					tipo = TipoConta.CONTA_POUPANÇA;
				} else {
					tipo = TipoConta.INDEFINIDO;
				}
				
				Conta novaConta = new Conta(numeroAgencia,numeroConta,titular,tipo);
				giuseppBank.abrirConta(novaConta);
				System.out.println("Conta criada com sucesso!");
				
			} else if (opcao == 3) {
				System.out.println("Digite o número da Conta a ser pesquisado: ");
				int numeroConta= sc.nextInt();
				sc.nextLine();

				
				Conta contaPesquisada = giuseppBank.pesquisarContaNumero(numeroConta);
				if(contaPesquisada == null) {
					System.out.println("Conta não encontrada!");
				} else {
					System.out.println("Conta encontrada! \n Titular:" + contaPesquisada.getTitular() + " Agencia: " + contaPesquisada.getNumeroAgencia() + " Saldo" + contaPesquisada.getExtrato());
				}
			} else if (opcao == 4) {
				System.out.println("Digite o número da Conta a ser emcerrada: ");
				int numeroConta = sc.nextInt();
				sc.nextLine();
				
				Conta contaPesquisada = giuseppBank.pesquisarContaNumero(numeroConta);
				if(contaPesquisada == null) {
					System.out.println("Conta não encontrada!");
				} else {
					giuseppBank.removerConta(contaPesquisada);
					System.out.println("Conta Encerrada com sucesso!");
				}
			}
				
		} while(opcao != 5);
		
		System.out.println("Giusepp agaradece seu dinheiro, meu chapa");
		

	}

}
