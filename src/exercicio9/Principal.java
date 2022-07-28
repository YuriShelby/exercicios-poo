package exercicio9;

import java.util.List;

public class Principal {
	
	private int numero;
	private String descricao;
	private int quantComprada;
	private double preco;
	
	
	
	public Principal() {
	}

	public Principal(int numero, String descricao, int quantComprada, double preco) {
		
		this.numero = numero;
		this.descricao = descricao;
		this.quantComprada = quantComprada;
		this.preco = preco;
		
	}
	
	public double multiplica(List<? extends Principal> list) {
		
		double multiplica = 0;
		for (int i = 0; i < list.size(); i ++) {
			multiplica = multiplica + list.get(i).getQuantComprada() * list.get(i).getPreco();
	
		}
		return multiplica;
	}
	
	public void info(List<? extends Principal> list) {
		
		for (int i = 0; i < list.size(); i ++) {
			System.out.printf("Cod:%d, Prod:%s, Quant:%d, Preço:R$%.2f\n", list.get(i).getNumero(), list.get(i).getDescricao(), list.get(i).getQuantComprada(), list.get(i).getPreco());
		}

	}

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
