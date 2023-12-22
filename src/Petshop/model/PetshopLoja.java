package Petshop.model;

public class PetshopLoja extends Petshop {

	private int quantidade;
	private String nomeProduto;

	public PetshopLoja(int tipo, String animal, float preco, int quantidade, String nomeProduto) {
		super(tipo, animal, preco);
		this.quantidade = quantidade;
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public boolean Retirar(int valor) {

		if (this.getQuantidade() < valor) {
			System.out.println("\n Quantidade Insuficiente!");
			return false;
		}

		this.setQuantidade(this.getQuantidade() - valor);
		return true;
	}

	public void Adicionar(int valor) {

		this.setQuantidade(this.getQuantidade() + valor);

	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Nome do Produto: " + this.nomeProduto);
	}
}
