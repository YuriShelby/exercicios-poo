package exercicio6;

public class Leite extends Produto {
	
	private int duracao;

	public Leite(String nome, double preco, String validade, int duracao) {
		super(nome, preco, validade);
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "Produto: Leite, Preço: "+getPreco()+", Data de validade: "+getValidade()+", Duração de validade em dias: "+duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
