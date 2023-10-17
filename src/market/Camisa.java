package market;

public class Camisa extends Produto{
	private String cor;
	private String tamanho;
	
	public Camisa(String id, String nome, double preco, String cor, String tamanho) {
		super(id, nome, preco);
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}
