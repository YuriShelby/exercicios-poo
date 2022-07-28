package exercicio8;

public abstract class Principal {
	
	private int numero;
	private String descricao;
	private int quantComprada;
	private double preco;
	
	public Principal (int numero, String descricao, int quantComprada, double preco) {
		
		this.numero = numero;
		this.descricao = descricao;
		this.quantComprada = quantComprada;
		this.preco = preco;
		
	}
	
	public double valorFatura() {
		double total = this.getQuantComprada() * this.getPreco();
		return total;
	}
	
	public abstract void info();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantComprada() {
		return quantComprada;
	}

	public void setQuantComprada(int quantComprada) {
		this.quantComprada = quantComprada;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
