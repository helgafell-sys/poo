package exercicio1;

import exercicio1.ItemBiblioteca;

public class Revista extends ItemBiblioteca {
	private String periodicidade;
	private String editora;
	private int numero;
	
	// Método construtor da classe Revista
	public Revista(String periodicidade, String editora) {
		this.periodicidade = periodicidade;
		this.editora = editora;
	}
	
	
	public String detalhes() {
		return "Periodicidade: " + periodicidade + 
				"\nEditora: " + editora +
				"\nNumero: " + numero;
	}
	
	public String getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}
