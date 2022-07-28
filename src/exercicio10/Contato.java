package exercicio10;

public class Contato {
	
	private String nome;
	private String numero;
	
	public Contato() {
		
	}
	
	public Contato(String nome, String numero) {
		
		this.nome = nome;
		this.numero = numero;
	}
	
	public void info() {
		
		System.out.printf("Nome: %s\n", this.getNome());
		System.out.printf("Telefone: %s\n", this.getNumero());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
