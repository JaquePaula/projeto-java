package Petshop.repository;

import Petshop.model.Petshop;

public interface PetshopRepository {

	// CRUD do produto (create, read, update e delete)
	public void procurarPorNumero(int numero);

	public void listarTodas();

	public void cadastrar(Petshop petshop);

	public void atualizar(Petshop petshop);

	public void deletar(int numero);
	
	// Métodos Ecommerce
	public void retirar(int numero, int valor);
	public void adicionar(int numero, int valor);

}
