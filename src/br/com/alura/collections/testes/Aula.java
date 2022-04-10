package br.com.alura.collections.testes;

public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	@Override
	public String toString() {
		return String.format("[Aula %s, com %s minutos]", this.titulo, this.tempo);
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	public int getTempo() {
		return tempo;
	}
	

}
