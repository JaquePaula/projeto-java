package Petshop;

import java.io.IOException;
import java.util.Scanner;
import Petshop.util.Cores;
import Petshop.model.Petshop;
import Petshop.model.PetshopBanho;
import Petshop.model.PetshopLoja;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numeroProduto, quantidade;
		String nomeProduto;
		float valorProduto;

		// Teste da Classe petshopBanho
		PetshopBanho produto2 = new PetshopBanho(1, "cachorro", 200, "tosa");
		produto2.visualizar();
		
		// Teste da Classe petshopLoja
		PetshopLoja produto3 = new PetshopLoja(2, "gato", 5, 16, "Comedouro");
		produto3.visualizar();

		while (true) {
			// true, pois ira ficar em loop infinito até que a opção 9 seja digitada.

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Produto  (depositar)       ");
			System.out.println("            2 - Listar todos os produto              ");
			System.out.println("            3 - Buscar produto por Numero            ");
			System.out.println("            4 - Atualizar Dados do produto           ");
			System.out.println("            5 - Apagar produto        (sacar)        ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			/*
			 * try { // usada para capturar eventuais erros de digitaçao opcao =
			 * leia.nextInt(); } catch (InputMismatchException e) {
			 * System.out.println("Digite valores inteiros!"); leia.nextLine(); opcao = 0;
			 */
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n -------------- Pet shop ---------");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Produto\n\n");

				System.out.println("Digite o Numero do produto: ");
				numeroProduto = leia.nextInt();
				System.out.println("Digite o Nome do produto: ");
				leia.skip("\\R?"); // ignora quebra de linha, para permitir que o next line leia palavras compostas
				nomeProduto = leia.nextLine();
				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas os produtos\n\n");

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados do produto por número\n\n");

				System.out.println("Digite o número do produto: ");
				numeroProduto = leia.nextInt();

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados do produto\n\n");

				System.out.println("Digite o número do produto: ");
				numeroProduto = leia.nextInt();

				// if ()
				System.out.println("Digite o Nome do produto: ");
				leia.skip("\\R?");
				nomeProduto = leia.nextLine();

				System.out.println("Digite o Valor do Produto (R$): ");
				valorProduto = leia.nextFloat();

				// else()

				System.out.println("\nProduto não encontrad!");

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar o produto\n\n");

				System.out.println("Digite o número da conta: ");
				numeroProduto = leia.nextInt();

				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Jaqueline Paula - jaquemarques.santos@gmail.com");
		System.out.println("https://github.com/JaquePaula");
		System.out.println("*********************************************************");
	}

// Com o Método keyPress(), o Menu será recarregado somente depois de pressionar a tecla enter.
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read(); // indica a leitura de um dispositivo de entrada padrão (teclado)

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
