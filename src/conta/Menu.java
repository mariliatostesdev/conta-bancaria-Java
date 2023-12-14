package conta;

import java.util.Scanner;
import conta.model.ContaBancaria;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		// Teste da Classe Conta

		ContaBancaria c1 = new ContaBancaria(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();

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
				ContaBancaria novaConta = new ContaBancaria(32157, 7697, 0, null, 0);
				System.out.println("\nPreencha os dados a seguir para criar sua conta:");
				System.out.println("\nDeseja criar uma conta (1)-Corrente  ou (2)-Poupança?");
				novaConta.setTipo(input.nextInt());

				input.nextLine();
				System.out.println("\nQual o nome do titular da conta?");
				novaConta.setTitular(input.nextLine());
				System.out.println("\nQual valor deseja depositar como seu saldo inicial?");
				novaConta.setSaldo(input.nextFloat());
				System.out.println("\n\n\tConta criada com sucesso! Os dados da sua conta são:");
				System.out.println("\n\tNúmero da conta: " + novaConta.getNumero());
				System.out.println("\n\tNúmero da agência: " + novaConta.getAgencia());

				if (novaConta.getTipo() == 1) {
					tipoNovaConta = "Conta Corrente";
				} else {
					tipoNovaConta = "Conta Poupança";
				}

				System.out.println("\n\tTipo de conta: " + tipoNovaConta);
				System.out.println("\n\tNome do titular da conta: " + novaConta.getTitular());
				System.out.println("\n\tSaldo da conta: R$" + novaConta.getSaldo());
				System.out.println("                                               ");
				System.out.println("***********************************************");

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
