package exercicio14;

public class Livro {
	
	private int registro;
	private String nome;
	private String genero;
	private String classicacao;
	
	public Livro(int registro, String nome, String genero, String classificacao) {
		
		this.registro = registro;
		this.nome = nome;
		this.genero = genero;
		this.classicacao = classificacao;
	}
	
	public void info() {
		
		System.out.printf("\nNome: %s   Cod:%d\n", this.nome, this.registro);
		System.out.printf("Gênero: %s\n", this.genero);
		System.out.printf("Classificação: %s\n", this.classicacao);
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClassicacao() {
		return classicacao;
	}

	public void setClassicacao(String classicacao) {
		this.classicacao = classicacao;
	}

}
