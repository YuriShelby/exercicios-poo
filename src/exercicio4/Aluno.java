package exercicio4;

public class Aluno extends Principal {
	
	public void info() {
		System.out.printf("Nome: %s\n", this.getNome());
		System.out.printf("S�rie: %s�\n", this.getSerie());
		System.out.printf("Nota1: %.2f\n", this.getNota1());
		System.out.printf("Nota2: %.2f\n", this.getNota2());
		System.out.printf("Nota3: %.2f\n", this.getNota3());
		System.out.printf("M�dia: %.2f\n\n", this.getMedia());
	}

}
