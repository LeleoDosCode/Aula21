package market;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto("1", "Um", 12.50);
		System.out.println(produto.getId());
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		
		Sorvete sorvete = new Sorvete("1", "um", 12.50, 0);
		System.out.println(sorvete.getTempAdequada());
		
		Camisa camisa = new Camisa("1", "um", 15.50, "Preta", "XGG");
		System.out.println(camisa.getCor());
		System.out.println(camisa.getTamanho());
	}

}
