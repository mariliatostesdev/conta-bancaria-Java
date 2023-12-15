package conta;

import java.util.Scanner;
import conta.model.ContaBancaria;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		// Teste da Classe Conta

		ContaBancaria cb = new ContaBancaria(1, 123, 1, "Adriana", 10000.0f);
		cb.visualizar();
		cb.sacar(12000.0f);
		cb.visualizar();
		cb.depositar(5000.0f);
		cb.visualizar();
		
		// Teste da Classe Conta Corrente
		ContaCorrente cc = new ContaCorrente(12, 764, 1, "Marilia Tostes", 60000.0f, 120000.0f);
		cc.visualizar();
		cc.sacar(3000.0f);
		cc.visualizar();
		cc.depositar(30000.0f);
		cc.visualizar();
		cc.sacar(300000.0f);
		cc.visualizar();
		
		
		// Teste da Classe Conta Poupança
		ContaPoupanca cp = new ContaPoupanca(12, 765, 2, "Rafael Tostes", 15120.0f, 26);
		cp.visualizar();
		cp.sacar(3000.0f);
		cp.visualizar();
		cp.depositar(30000.0f);
		cp.visualizar();
		cp.sacar(300000.0f);
		cp.visualizar();
		
		
		// Fim do Teste da Classe Conta

		Scanner input = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "***********************************************");
			System.out.println("                                               ");
			System.out.println("             BANCO DO BRAZIL COM Z             ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("        1 - Criar Conta                        ");
			System.out.println("        2 - Listar Todas as Contas             ");
			System.out.println("        3 - Buscar Conta por Numero            ");
			System.out.println("        4 - Atualizar Dados da Conta           ");
			System.out.println("        5 - Apagar Conta                       ");
			System.out.println("        6 - Sacar                              ");
			System.out.println("        7 - Depositar                          ");
			System.out.println("        8 - Transferir valores entre contas    ");
			System.out.println("        9 - Sair                               ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("Entre com a opção desejada:                    ");
			System.out.println("                                               " + Cores.TEXT_RESET);

			opcao = input.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				input.close();
				System.exit(0);
			}

			String tipoNovaConta;

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência Entre Contas\n\n");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n***********************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Marília Tostes - mahtostes.dev@gmail.com");
		System.out.println("github.com/mariliatostesdev");
		System.out.println("***********************************************");
	}
}
