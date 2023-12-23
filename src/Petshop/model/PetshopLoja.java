package Petshop.model;

public class PetshopLoja extends Petshop {

	private String nomeProduto;
	private int total;

	public PetshopLoja(int numero, float preco, int quantidade, String nomeProduto, int total) {
		super(numero, preco, quantidade);
		this.nomeProduto = nomeProduto;
		this.total = total;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	

	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public boolean retirar(int valor) {

	if (this.getQuantidade() < valor) {
		System.out.println("\n Quantidade Insuficiente!");
		return false;
		}

	this.setQuantidade(this.getQuantidade() - valor);
	return true;
}


	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Quantidade Máxima: " + this.total);
		System.out.println("Nome do Produto: " + this.nomeProduto);
	}
}
