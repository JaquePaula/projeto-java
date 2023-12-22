package Petshop.model;

public class PetshopBanho extends Petshop {

	private String serviço;

	public PetshopBanho(int tipo, String animal, float preco, String serviço) {
		super(tipo, animal, preco);
		this.serviço = serviço;
	}

	public String getServiço() {
		return serviço;
	}

	public void setServiço(String serviço) {
		this.serviço = serviço;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Banho ou tosa?: " + this.serviço);

	}

}
