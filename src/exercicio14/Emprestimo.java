package exercicio14;

public class Emprestimo {
	
	private int matricula;
	private String nome;
	private String nomeLivro;
	private String dataEmprestimo;
	private String dataDevolucao;
	
	public Emprestimo(int matricula, String nome, String nomeLivro, String dataEmprestimo, String dataDevolucao) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.nomeLivro = nomeLivro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	
	public void info() {
		
		System.out.printf("\nNome: %s   Mat:%d\n", this.nome, this.matricula);
		System.out.printf("Livro: %s\n", this.nomeLivro);
		System.out.printf("Data de saída: %s\n", this.dataEmprestimo);
		System.out.printf("Data de retorno: %s\n", this.dataDevolucao);
	}
	
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
}
