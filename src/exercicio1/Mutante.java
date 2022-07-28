package exercicio1;

public class Mutante extends Cadastro {

	private String habilidade;
	
	public Mutante(String nome, String cpf, int idade, double altura, double peso, String sexo, String habilidade) {
		super(nome, cpf, idade, altura, peso, sexo);
		this.habilidade = habilidade;
		
	}
	
	@Override
	public void info() {
		System.out.printf("\nNome: %s\n", this.getNome());
		System.out.printf("CPF: %s\n", this.getCpf());
		System.out.printf("Idade: %d\n", this.getIdade());
		System.out.printf("Altura: %.2f\n", this.getAltura());
		System.out.printf("Peso: %.2f\n", this.getPeso());
		System.out.printf("Sexo: %s\n", this.getSexo());
		maiorIdade();
		System.out.printf("Habilidade: %s\n", this.habilidade);
		
		
	}

	public String getHabilidade() {
		return habilidade;
	}
	
}
