package exercicio3;

public class Main {
	
	public static void main(String[] args) {
		
		AlunoFundamental aluno1 = new AlunoFundamental(null, 0, 0, 0, 0);
	    AlunoFundamental aluno2 = new AlunoFundamental("Maria", 8, 4.5, 5.8, 7.0);
		
	    aluno1.setNome("Pedro");
	    aluno1.setSerie(7);
	    aluno1.setNota1(9.0);
	    aluno1.setNota2(6.4);
	    aluno1.setNota3(5.1);
	    
	    
	    
	    aluno1.info();
	    aluno2.info();
	    
	}

}
