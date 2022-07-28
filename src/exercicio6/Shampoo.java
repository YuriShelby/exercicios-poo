package exercicio6;

public class Shampoo extends Produto {
	
	private int irritabilidade;

	public Shampoo(String nome, double preco, String validade, int irritabilidade) {
		super(nome, preco, validade);
		this.irritabilidade = irritabilidade;
	}
	
	@Override
	public String toString() {
		return "Produto: Shampoo, Preço: "+getPreco()+", Data de validade: "+getValidade()+", Irritabilidade: "+irritabilidade;
	}

	public int getIrritabilidade() {
		return irritabilidade;
	}

	public void setIrritabilidade(int irritabilidade) {
		this.irritabilidade = irritabilidade;
	}
	
}
