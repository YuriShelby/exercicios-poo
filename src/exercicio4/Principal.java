package exercicio4;

public abstract class Principal {
	
	private String nome;
	private int serie;
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	private double totalMedia;
	
	public abstract void info();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return media = (nota1 + nota2 + nota3) / 3;
	}

	public double getTotalmedia() {
		return totalMedia;
	}
	
}
