package exercicio6;

public class Biscoito extends Produto {
	
	private int quimicaCancer;

	public Biscoito(String nome, double preco, String validade, int quimicaCancer) {
		super(nome, preco, validade);
		this.quimicaCancer = quimicaCancer;
	}
	
	@Override
	public String toString() {
		return "Produto: Biscoito, Pre�o: "+getPreco()+", Data de validade: "+getValidade()+", Componentes cancer�genos: "+quimicaCancer;
	}

	public int getQuimicaCancer() {
		return quimicaCancer;
	}

	public void setQuimicaCancer(int quimicaCancer) {
		this.quimicaCancer = quimicaCancer;
	}

}
