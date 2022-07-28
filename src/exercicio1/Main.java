package exercicio1;

public class Main {
	
	public static void main(String[] args) {
			
	    Pessoa pessoa1 = new Pessoa("Yuri", "98765432100", 33, 1.69, 72.5, "Masculino");
		Pessoa pessoa2 = new Pessoa("Jessica", "12345678912", 24, 1.57, 48.3, "Feminino");
		Mutante mutante1 = new Mutante("Flyer", "01928374650", 16, 1.72, 68, "Masculino", "Voar");
			
		pessoa1.info();
		mutante1.info();
		pessoa2.info();
		
		
	}

}
