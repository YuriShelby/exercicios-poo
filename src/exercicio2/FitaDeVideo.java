package exercicio2;

public class FitaDeVideo {
	
	private String titulo;
	private String genero;
	private int duracao;
	
	public FitaDeVideo(String titulo, String genero, int duracao) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracao() {
		int horas = duracao / 60;
		int min = duracao %60;
		
		if(min >= 10) {
		    return ""+horas+":"+min+"";
		}else {
			return ""+horas+":0"+min+"";
		}
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void info() {
		
		System.out.printf(this.titulo);
		System.out.printf(" (%s)",this.genero);
		System.out.printf(" %s\n", getDuracao());
		
	}

}
