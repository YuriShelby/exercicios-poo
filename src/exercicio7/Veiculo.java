package exercicio7;

public abstract class Veiculo {
	
	private String modelo;
	private String marca;
	private int ano;
	private double valorLocacao;
	private int quantDias;
	
	public Veiculo(String modelo, String marca, int ano, double valorLocacao, int quantDias) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.valorLocacao = valorLocacao;
		this.quantDias = quantDias;
		
	}
	
	public abstract void info();

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public int getQuantDias() {
		return quantDias;
	}

	public void setQuantDias(int quantDias) {
		this.quantDias = quantDias;
	}
	
	

}
