package Petshop;

import java.io.IOException;
import java.util.Scanner;
import Petshop.util.Cores;
import Petshop.controller.PetshopController;
import Petshop.model.PetshopBanho;
import Petshop.model.PetshopLoja;



public class Menu {

	public static void main(String[] args) {

		PetshopController produtos = new PetshopController();

		Scanner leia = new Scanner(System.in);

		int opcao, numeroProduto, quantidade, tipo, total = 0;
		String nomeProduto, servico;
		float valorProduto;
		
		
		System.out.println("Criar produtos ou serviços");
		
		
		PetshopLoja p1 = new PetshopLoja (produtos.gerarNumero(),24,5,"arranhador", 20) ;
		produtos.cadastrar(p1);
		
		PetshopLoja p2 = new PetshopLoja (produtos.gerarNumero(),22,2,"comedouro", 15) ;
		produtos.cadastrar(p2);
		
		PetshopBanho p3 = new PetshopBanho (produtos.gerarNumero(),100,3,"banho") ;
		produtos.cadastrar(p3);
		
		PetshopBanho p4 = new PetshopBanho (produtos.gerarNumero(),50,2,"tosa") ;
		produtos.cadastrar(p4);
		
	

		while (true) {
			// true, pois ira ficar em loop infinito até que a opção 9 seja digitada.

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Produto ou serviço   depositar)       ");
			System.out.println("            2 - Listar todos os produto              ");
			System.out.println("            3 - Buscar produto por Numero            ");
			System.out.println("            4 - Atualizar Dados do produto           ");
			System.out.println("            5 - Apagar produto        (sacar)        ");
			System.out.println("            6 - Retirar quantidade produto           ");
			System.out.println("            7 - Inserir quantidade produto           ");
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
				do {
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Produto (1) ou serviço (2)?\n\n");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					
					System.out.println("Digite o Nome do produto: ");
					leia.skip("\\R?"); // ignora quebra de linha, para permitir que o next line leia palavras compostas
					nomeProduto = leia.nextLine();
					System.out.println("Digite o valor do produto: ");
					valorProduto = leia.nextFloat();
					System.out.println("Digite quantidade: ");
					quantidade = leia.nextInt();
					produtos.cadastrar(new PetshopLoja(produtos.gerarNumero(), valorProduto, quantidade,
							nomeProduto, total));

				}
				case 2 -> {
					
					System.out.println("Digite o valor do serviço: ");
					valorProduto = leia.nextFloat();
					System.out.println("Digite quantidade: ");
					quantidade = leia.nextInt();
					System.out.println("*****  Banho *******");
					servico = leia.nextLine();
					produtos.cadastrar(new PetshopBanho(produtos.gerarNumero(), valorProduto,quantidade, servico));
				}
				}

				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas os produtos\n\n");
				produtos.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados do produto por número\n\n");

				System.out.println("Digite o número do produto: ");
				numeroProduto = leia.nextInt();
				
				produtos.procurarPorNumero(numeroProduto);

				keyPress();
				break;
			case 4:
				
                System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados do Produto ou serviço\n\n");
				
				System.out.println("Digite o número do produto ou serviço: ");
				numeroProduto = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(numeroProduto);

				if (buscaProduto != null) {
					
					tipo = buscaProduto.getNumero();
					
					switch(tipo) {
				case 1:
					do {
						System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Produto (1) ou serviço (2)?\n\n");
						tipo = leia.nextInt();
					} while (tipo < 1 && tipo > 2);

					switch (tipo) {
					case 1 -> {
						
						System.out.println("Digite o Nome do produto: ");
						leia.skip("\\R?"); // ignora quebra de linha, para permitir que o next line leia palavras compostas
						nomeProduto = leia.nextLine();
						System.out.println("Digite o valor do produto: ");
						valorProduto = leia.nextFloat();
						System.out.println("Digite quantidade: ");
						quantidade = leia.nextInt();
						produtos.atualizar(new PetshopLoja(numeroProduto, valorProduto, quantidade,
								nomeProduto, total));

					}
					case 2 -> {
						
						System.out.println("Digite o valor do serviço: ");
						valorProduto = leia.nextFloat();
						System.out.println("Digite quantidade: ");
						quantidade = leia.nextInt();
						System.out.println("*****  Banho *******");
						servico = leia.nextLine();
						produtos.atualizar(new PetshopBanho(numeroProduto, valorProduto, quantidade, servico));
					}
						default -> {
							System.out.println("Tipo de produto inválido!");
						}
					
					}
					}
					} else {
					System.out.println("\nProduto não encontrado!");
					}
				
	
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar o produto\n\n");

				System.out.println("Digite o número do produto: ");
				numeroProduto = leia.nextInt();
				
				produtos.deletar(numeroProduto);

				keyPress();
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Retirada de produto\n\n");
				
				System.out.println("Digite o Numero do produto: ");
				numeroProduto = leia.nextInt();

				do {
					System.out.println("Digite a quantidade de retirada: ");
					quantidade = leia.nextInt();
				} while (quantidade <= 0);

				produtos.retirar(numeroProduto, quantidade);

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Adicionar produto\n\n");
				
				System.out.println("Digite o Numero da produto: ");
				numeroProduto = leia.nextInt();

				do {
					System.out.println("Digite a quantidade de produto a adicionar: ");
					quantidade = leia.nextInt();
				} while (quantidade <= 0);

				produtos.adicionar(numeroProduto, quantidade);

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
