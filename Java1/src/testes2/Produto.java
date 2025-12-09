package testes2;

public class Produto extends Item implements Tributavel {
	
	private double peso;
	
	public double calculaImposto() {
		return getPreco() * 0.1;
	}

	// Getters e Setters
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
}
