package Petshop.model;

public abstract class Petshop {

	private int tipo;
	private String animal;
	private float preco;

	public Petshop(int tipo, String animal, float preco) {

		this.tipo = tipo;
		this.animal = animal;
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	// Método visualizar definido como void(ele não precisa retornar uma
	// confirmação, e sim exibir os dados de um Objeto conta)
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Salão Pet";
			break;
		case 2:
			tipo = "Loja";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Informações do Pet Shop:");
		System.out.println("***********************************************************");
		System.out.println("Necessidade: " + tipo);
		System.out.println("Animal: " + this.animal);
		System.out.println("Valor unitário: " + this.preco);

	}
}
