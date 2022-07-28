package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class SuperMercado {

	public static void main(String[] args) {
		
		Calcular cal = new Calcular();
		List<Shampoo> shampoo = new ArrayList<>();
		
		shampoo.add(new Shampoo("Dove", 15.0, "02/02/2022",5));
		shampoo.add(new Shampoo("Jhonsons", 20.0, "11/09/2021",3));
		shampoo.add(new Shampoo("Clear", 10.0, "10/10/2021",4));
		shampoo.add(new Shampoo("Brilho", 10.0, "03/04/2022",5));
		shampoo.add(new Shampoo("Fortaleza", 15.0, "15/01/2022",7));
		System.out.println("Shampoo\n");
		System.out.printf("Média: %.2f\n", cal.media(shampoo));
		System.out.printf("Mais barato: %.2f\n", cal.maisBarato(shampoo));
		System.out.printf("Mais caro: %.2f\n\n", cal.maisCaro(shampoo));
		
		List<Biscoito> biscoito = new ArrayList<>();
		
		biscoito.add(new Biscoito("Oreo", 10.0,"05/03/2022", 7));
		biscoito.add(new Biscoito("Toddy", 7.0,"12/12/2021", 6));
		biscoito.add(new Biscoito("Nescau", 8.0,"17/09/2021", 5));
		biscoito.add(new Biscoito("Passatempo", 6.0,"17/10/2021", 8));
		biscoito.add(new Biscoito("Negresco", 5.0,"18/09/2021", 7));
		System.out.println("Biscoito\n");
		System.out.printf("Média: %.2f\n", cal.media(biscoito));
		System.out.printf("Mais barato %.2f\n", cal.maisBarato(biscoito));
		System.out.printf("Mais caro: %.2f\n\n", cal.maisCaro(biscoito));
		
		List<Leite> leite = new ArrayList<>();
		
		leite.add(new Leite("Mimosa", 7.0, "10/10/2021", 5));
		leite.add(new Leite("Itambé", 8.0, "11/10/2021", 7));
		leite.add(new Leite("Piracanjuba", 9.0, "19/04/2022", 5));
		leite.add(new Leite("Campos do Jordão", 7.0, "18/05/2022", 5));
		leite.add(new Leite("Elegê", 8.0, "05/05/2022", 8));
		System.out.println("Leite\n");
		System.out.printf("Média: %.2f\n", cal.media(leite));
		System.out.printf("Mais barato: %.2f\n", cal.maisBarato(leite));
		System.out.printf("Mais caro: %.2f\n", cal.maisCaro(leite));

	}

}
