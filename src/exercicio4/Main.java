package exercicio4;

public class Main {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();

		aluno1.setNome("João");
		aluno1.setSerie(5);
		aluno1.setNota1(7.6);
		aluno1.setNota2(6.3);
		aluno1.setNota3(5.2);

		Aluno aluno2 = new Aluno();

		aluno2.setNome("Maria");
		aluno2.setSerie(5);
		aluno2.setNota1(7.8);
		aluno2.setNota2(9.4);
		aluno2.setNota3(10);

		Aluno aluno3 = new Aluno();

		aluno3.setNome("Clara");
		aluno3.setSerie(5);
		aluno3.setNota1(7.1);
		aluno3.setNota2(4.0);
		aluno3.setNota3(5.3);

		Aluno aluno4 = new Aluno();

		aluno4.setNome("Joaquina");
		aluno4.setSerie(5);
		aluno4.setNota1(6.8);
		aluno4.setNota2(7.1);
		aluno4.setNota3(9.2);

		Aluno aluno5 = new Aluno();

		aluno5.setNome("Pedro");
		aluno5.setSerie(5);
		aluno5.setNota1(5.2);
		aluno5.setNota2(3.2);
		aluno5.setNota3(4.7);

		aluno1.info();
		aluno2.info();
		aluno3.info();
		aluno4.info();
		aluno5.info();
		System.out.println("--------------------");
		System.out.printf("Média total: %.2f\n", (aluno1.getMedia() + aluno2.getMedia() + aluno3.getMedia() + aluno4.getMedia() + aluno5.getMedia()) / 5);

	}

}
