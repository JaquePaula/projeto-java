package Petshop.model;

public class PetshopBanho extends Petshop {

	private int banhos;
	private String serviço;

	public PetshopBanho(int numero, float preco, int banhos, String serviço) {
		super(numero, preco, banhos);
		this.serviço = serviço;
		this.banhos = banhos;
	}

	public String getServiço() {
		return serviço;
	}

	public void setServiço(String serviço) {
		this.serviço = serviço;
	}
	
	public int getBanhos() {
		return banhos;
	}

	public void setBanhos(int banhos) {
		this.banhos = banhos;
	}
	
	public boolean retirar(int valor) {

	if (this.getBanhos() < valor) {
		System.out.println("\n Quantidade Insuficiente!");
		return false;
		}

	this.setBanhos(this.getBanhos() - valor);
	return true;
}

	public void visualizar() {
		super.visualizar();
		System.out.println( this.serviço);
		System.out.println( this.banhos);
	}

}
