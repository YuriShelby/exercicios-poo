package exercicio12;

public class Aluno extends Pessoa {
	
	private int anoIngresso;
	private String serie;
	
	public Aluno(String nome, String cpf, int anoIngresso, String serie) {
		super(nome, cpf);
		this.anoIngresso = anoIngresso;
		this.serie = serie;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("Ano Ingresso: %d\n", this.anoIngresso);
		System.out.printf("Série: %s\n", this.serie);
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

}
