package exercicio14;

public class Principal {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Yuri Moura", 1, "08/10/1988", "Caria�� 56 201 Iraj�", "15/07/2022");
		Livro livro1 = new Livro(1, "Peter Pan", "Aventura", "Livre");
		Emprestimo emprestimo1 = new Emprestimo(1, "Yuri", "Peter Pan", "15/07/2022", "30/07/2022");
		
		pessoa1.info();
		livro1.info();
		emprestimo1.info();
		
	}

}



// Fa�a um programa para controle de empr�stimo de livros, com as classes Emprestimo, Livro e Pessoa.