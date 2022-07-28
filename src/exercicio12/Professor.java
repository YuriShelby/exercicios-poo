package exercicio12;

public class Professor extends Pessoa {
	
	private String materia;
	private double salario;
	
	public Professor(String nome, String cpf, String materia, double salario) {
		super(nome, cpf);
		this.materia = materia;
		this.salario = salario;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("Matéria: %s\n", this.materia);
		System.out.printf("Salário: %.2f\n", this.salario);
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
