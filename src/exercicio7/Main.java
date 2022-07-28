package exercicio7;

public class Main {
	
	public static void main(String[] args) {
		
		Passeio carro1 = new Passeio("Ford", "Focus", 2012, 60.0, 10);
		Util carro2 = new Util("Ford", "Ka", 2016, 70.50, 14);
		
		carro1.info();
		carro2.info();
	
	}

}
