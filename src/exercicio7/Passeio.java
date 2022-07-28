package exercicio7;

public class Passeio extends Veiculo {

	public Passeio(String modelo, String marca, int ano, double valorLocacao, int quantDias) {
		super(modelo, marca, ano, valorLocacao, quantDias);
	}

	@Override
	public void info() {
		
		System.out.printf("Modelo: %s\n", getModelo());
		System.out.printf("Marca: %s\n", getMarca());
		System.out.printf("Ano: %d\n", getAno());
		System.out.printf("Valor da locação: %.2f\n", getValorLocacao());
		System.out.printf("Quantidade de dias: %d\n", getQuantDias());
		System.out.printf("Valor total a ser pago: R$%.2f\n\n", total());
	}
	
	public double total() {
		double valorTotal = this.getQuantDias() * this.getValorLocacao() - 20;
		return valorTotal;
	}

}
