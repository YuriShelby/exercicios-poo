package exercicio11;

public class Main {
	
	public static void main(String[] args) {
		
		Principal conta1 = new Principal();
		
		conta1.setSaldo(4000);
		conta1.setNumeroConta(408);;
		conta1.setDigitoConta(1);
		conta1.setTitular("Yuri Moura");
		
		conta1.depositar(650);
		conta1.sacar(1500);
		
	    System.out.println(conta1.getSaldo());	
		
	}

}
