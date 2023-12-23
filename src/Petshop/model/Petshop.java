package Petshop.model;

public abstract class Petshop {


	private float preco;
	private int numero;
	private int quantidade;

	public Petshop(int numero, float preco, int quantidade) {
		
		this.numero = numero;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	
	// criando get e set: source > generate getters and setters. Atributo será retornado através do return 
		public int getNumero() {
			return numero;
		}

	// o set é assinado com void, pois o valor sera alterado e nao vai retornar valor. Ele sera o valor atraves do .this
		public void setNumero(int numero) {
			this.numero = numero;
		}


	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public boolean retirar(int valor) {

		if (this.getQuantidade() < valor) {
			System.out.println("\n Quantidade Insuficiente!");
			return false;
		}

		this.setQuantidade(this.getQuantidade() - valor);
		return true;
	}
	
	public void adicionar(int valor) {

		this.setQuantidade(this.getQuantidade() + valor);

	}
	
	
	


	// Método visualizar definido como void(ele não precisa retornar uma
	// confirmação, e sim exibir os dados de um Objeto conta)
	public void visualizar() {

	

		System.out.println("\n\n***********************************************************");
		System.out.println("Informações do Pet Shop:");
		System.out.println("***********************************************************");
		System.out.println("Valor unitário: " + this.preco);

	}
}
