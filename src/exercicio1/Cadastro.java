package exercicio1;

public abstract class Cadastro {
	
	private String nome;
	private String cpf;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public Cadastro(String nome, String cpf, int idade, double altura, double peso, String sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	public abstract void info();
	
	public void maiorIdade() {
		if(this.getIdade() >= 18) {
			System.out.printf("Maior de idade\n");
		}else {
			System.out.printf("Menor de idade\n");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
