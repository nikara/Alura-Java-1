package testes2;

public class Servico extends Item {
	
	private int quantidadeDeHoras;
	
	public double calculaImposto() {
		
		return getPreco() * 0.12;
	}
	

	
	// Getters e Setters
	public int getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}

	public void setQuantidadeDeHoras(int quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}
	
	
	
	
	
}
