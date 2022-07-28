package exercicio3;

public class AlunoFundamental extends Cadastro {

	public AlunoFundamental(String nome, int serie, double nota1, double nota2, double nota3) {
		super(nome, serie, nota1, nota2, nota3);
		
	}
	
    public void info(){
		
		System.out.printf("Nome: %s\n", this.getNome());
		System.out.printf("Série: %dª\n", this.getSerie());
		System.out.printf("Nota1: %.2f\n", this.getNota1());
		System.out.printf("Nota2: %.2f\n", this.getNota2());	
		System.out.printf("Nota3: %.2f\n", this.getNota3());
		System.out.printf("Média: %.2f\n", this.getMedia());
		if (this.getNota1() + this.getNota2() + this.getNota3() < 18) {
			System.out.println("Aluno Reprovado\n");
		}else {
			System.out.println("Aluno Aprovado\n");
		}
		
	}

}
