package myTasks;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		boolean situacao = true;
		
		Scanner input = new Scanner(System.in);
		Conta minhaConta = new Conta(1);
		
		while(situacao) {
			System.out.println(
					"Bem-vindo ao seu Banco Digital"
					+ "\nQual das opcoes deseja?"
					+ "\n1 - Ver meu saldo"
					+ "\n2 - Ver numero da conta"
					+ "\n3 - Creditar"
					+ "\n4 - Sacar"
					+ "\n5 - Sair"
			);
			
			int opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Valor da minha Conta: " + minhaConta.getSaldo());
				break;
			case 2:
				System.out.println("Valor da minha Conta: " + minhaConta.getNumero());
				break;
			case 3:
				double credito = input.nextDouble();
				minhaConta.creditar(credito);
				break;
			case 4:
				double saque = input.nextDouble();
				minhaConta.sacar(saque);				
				break;
			case 5:
				situacao = false;
				break;
			default:
				System.out.println("Opção inválida!");				
			}
		}
		
		input.close();
	}
}
