package exercicio10;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contato> agenda;
	
	public Agenda() {
		this.agenda = new ArrayList<Contato>();
	}
	
	public void add(Contato c) {
		agenda.add(c);
	}
	
	public void mostrarAgenda() {
		
		for(int i = 0; i < this.agenda.size(); i ++) {
			agenda.get(i).info();
			System.out.println("--------------------------");
		}
		
	}
	
	public void remove(int i) {
		agenda.remove(i);
	}
	
	public void removeTodos() {
		agenda.clear();
		System.out.println("Todos os contatos foram apagados com sucesso!");
	}

}
