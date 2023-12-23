package Petshop.controller;

import java.util.ArrayList;

import Petshop.model.Petshop;
import Petshop.repository.PetshopRepository;



public class PetshopController implements PetshopRepository {
	
	
	private ArrayList<Petshop> listaProdutos = new ArrayList<Petshop>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("O produto: " + numero + " não foi encontrado");
	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar (Petshop petshop) {
		listaProdutos.add(petshop);
		System.out.println("O produto ou serviço número: " + petshop.getNumero() + " foi criado com sucesso!");
	}


	@Override
	public void atualizar(Petshop petshop) {
		
	
		var buscaProduto = buscarNaCollection(petshop.getNumero());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), petshop);
			System.out.println("O produto número: " + petshop.getNumero() + " foi atualizado com sucesso.");
		} else
			System.out.println("O produto número: " + petshop.getNumero() + " não foi encontrado.");
	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto numero: " + numero + " foi deletado com sucesso!");
		} else
			System.out.println("\nO produto numero: " + numero + " não foi encontrado!");
		
		
	}
		@Override
		public void retirar(int numero, int valor) {
			var produto = buscarNaCollection(numero);

			if (produto != null) {

				if (produto.retirar(valor) == true) {
					System.out.println("\nA retirada do produto numero: " + numero + " foi efetuada com sucesso!");

			} else 
				System.out.println("\nO Produto numero: " + numero + " não foi encontrado!");

			}
		}

		@Override
		public void adicionar(int numero, int valor) {
			var produto = buscarNaCollection(numero);

			if (produto != null) {
				produto.adicionar(valor);
				System.out.println("\nO Produto numero: " + numero + " foi adicionado com sucesso!");
			} else
				System.out.println(
						"\nO produto numero: " + numero + " não foi encontrado!");
	}
	
	public int gerarNumero() {
		return ++numero;
	}
	
	public Petshop buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
				
			}
		}
		return null;
	}


}
