package exercicio5;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int n = teclado.nextInt();
		
		Aluno alunos[] = new Aluno[n];
		double soma = 0;
		
		for (int i = 0; i < alunos.length; i ++) {
			System.out.printf("\nAluno: %d\n", i + 1);
			System.out.print("Nome: ");
			String nome = teclado.next();
			System.out.print("Nota 1: ");
			double nota1 = teclado.nextDouble();
			System.out.print("Nota 2: ");
			double nota2 = teclado.nextDouble();
			System.out.print("Nota 3: ");
			double nota3 = teclado.nextDouble();
			alunos[i] = new Aluno(nome,nota1,nota2,nota3);
			soma = soma + alunos[i].getMedia();
			System.out.printf("Média: %.2f\n", alunos[i].getMedia());
		}
		
		System.out.printf("\nMédia total da turma: %.2f", soma / alunos.length);
		
		teclado.close();
		
	}

}
