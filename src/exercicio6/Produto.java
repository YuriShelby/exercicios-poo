package exercicio6;

public abstract class Produto {
	
	private String nome;
	private double preco;
	private String validade;
	
	public Produto(String nome, double preco, String validade) {
		
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}
	
	public abstract String toString();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	

}
