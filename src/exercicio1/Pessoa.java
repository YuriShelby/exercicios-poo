package exercicio1;

public final class Pessoa extends Cadastro {
	
	public Pessoa(String nome, String cpf, int idade, double altura, double peso, String sexo) {
		super(nome, cpf, idade, altura, peso, sexo);
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
	}

}
