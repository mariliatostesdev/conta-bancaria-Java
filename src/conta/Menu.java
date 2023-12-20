package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		Scanner input = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		//Vamos criar algumas contas (Objetos da classe ContaBancaria) para facilitar nossos testes
		System.out.println("\nCriar Contas\n");
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		

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

			try {
				opcao = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				input.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				input.close();
				System.out.println("\nPrograma finalizado.");
				System.exit(0);

			}

			switch (opcao) {
			case 1 -> {
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");

				System.out.println("Digite o Número da Agência: ");
				agencia = input.nextInt();

				System.out.println("Digite o Nome do Titular: ");
				input.skip("\\R?"); // Também poderia só inserir "input.nextLine();"
				titular = input.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = input.nextInt();
				} while (tipo != 1 && tipo != 2);

				System.out.println("Digite o Saldo da Conta: ");
				saldo = input.nextFloat();

				switch (tipo) {
					case 1 -> {
						System.out.println("Digite o Limite de Crédito da Conta Corrente: ");
						limite = input.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversário da Conta Poupança: ");
						aniversario = input.nextInt();
						contas.cadastrar(
								new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
	
					}
				}
				keyPress();
				break;
			}
			case 2 -> {
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
				contas.listarTodas();
				keyPress();
				break;
			}
			case 3 -> {
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");

				keyPress();
				break;
			}
			case 4 -> {
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");

				keyPress();
				break;
			}
			case 5 -> {
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta\n\n");

				keyPress();
				break;
			}
			case 6 -> {
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

				keyPress();
				break;
			}
			case 7 -> {
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				keyPress();
				break;
			}
			case 8 -> {
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência Entre Contas\n\n");

				keyPress();
				break;
			}
			default -> {
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");

				keyPress();
				break;
			}
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

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("\nVocê pressionou uma tecla diferente de Enter!");
		}
	}
}
