package exercicio12;

public class Main {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("José", "12345678901", 2020, "Sexto Ano");
		Professor prof1 = new Professor("Luiz", "09876543211", "Matematica", 3000);
		Pessoa pessoa1 = new Pessoa("João", "12345678900");
		
		aluno1.info();
		prof1.info();
		pessoa1.info();
		
	}

}
