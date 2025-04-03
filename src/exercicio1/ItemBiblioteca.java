package exercicio1;

public class ItemBiblioteca {
	
	private String titulo;
	private int ano;
	private boolean disponivel;
	
	
	public String detalhes1() {
		return "Titulo: " + titulo + 
				"\nAno: " + ano +
				"\nDisponivel: " + disponivel;
	}
		
	public void emprestar() {
		
	}
	
	public void devolver() {
		
	}
	
	
	public String detalhes() {
		return "";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	
	
	
}
