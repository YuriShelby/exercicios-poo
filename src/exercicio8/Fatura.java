package exercicio8;

public class Fatura extends Principal {
	
	public Fatura(int numero, String descricao, int quantComprada, double preco) {
		super(numero, descricao, quantComprada, preco);
	}
	
	@Override
	public void info() {
		
		System.out.printf("Produto: %d\n", this.getNumero());
		System.out.printf("Nome: %s\n", this.getDescricao());
		System.out.printf("Quantidade: %d\n", this.getQuantComprada());
		System.out.printf("Preço unitário: %.2f\n", this.getPreco());
		System.out.printf("Valor total: %.2f\n\n", valorFatura());
		
	}

}
