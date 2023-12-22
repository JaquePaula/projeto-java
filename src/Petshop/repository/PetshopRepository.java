package Petshop.repository;

import Petshop.model.Petshop;

public interface PetshopRepository {

	// CRUD da Conta (create, read, update e delete)
	public void procurarPorNumero(int numero);

	public void listarTodas();

	public void cadastrar(Petshop petshop);

	public void atualizar(Petshop petshop);

	public void deletar(int numero);

}
