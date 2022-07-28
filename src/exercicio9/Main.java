package exercicio9;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Principal resultado = new Principal();
		List<Fatura> fatura1 = new ArrayList<>();
		
		fatura1.add(new Fatura(1, "Teclado", 2, 65.30));
		fatura1.add(new Fatura(2, "Mouse", 3, 16.90));
		fatura1.add(new Fatura(3, "MousePad", 1, 50.0));
		
		resultado.info(fatura1);
		System.out.printf("\nValor total: R$%.2f", resultado.multiplica(fatura1));
		

	}

}
