package exercicio10;

public class Principal {
	
	public static void main(String [] args) {
		
		Contato contato1 = new Contato("Yuri Moura", "(21) 99827-8008");
		Contato contato2 = new Contato("Maria Joaquina", "(21) 99999-9999");
		Contato contato3 = new Contato("Olivia Rodrigo", "(21) 98888-8888");
		
		Agenda agenda1 = new Agenda();
		
		agenda1.add(contato1);
		agenda1.add(contato2);
		agenda1.add(contato3);
		
		agenda1.mostrarAgenda();
		
	}

}
