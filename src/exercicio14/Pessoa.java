package exercicio14;

public class Pessoa {
	
	private String nome;
	private int matricula;
	private String nascimento;
	private String endereco;
	private String dataRegistro;
	
	public Pessoa(String nome, int matricula, String nascimento, String endereco, String dataRegistro) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.dataRegistro = dataRegistro;
	}
	
    public void info() {
		
		System.out.printf("\nNome: %s   Mat:%d\n", this.nome, this.matricula);
		System.out.printf("Nascimento: %s\n", this.nascimento);
		System.out.printf("Endereço: %s\n", this.endereco);
		System.out.printf("Data de registro: %s\n", this.dataRegistro);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

}
