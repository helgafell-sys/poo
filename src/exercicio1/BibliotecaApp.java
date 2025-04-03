package exercicio1;

import javax.swing.JOptionPane;

public class BibliotecaApp {
	
	public static void main(String[] args) {
		
	String autor
		= JOptionPane.showInputDialog("Infome o nome do autor: ");
	String isbn
		= JOptionPane.showInputDialog("Infome o ISBN: ");
	
		
	Livro l1 = new Livro(autor, isbn);
	l1.setTitulo("Joaozinho Gabriel");
	l1.setAno(1999);
	l1.setNumeroPaginas(50);
	System.out.println(l1.detalhes());
	System.out.println(l1.detalhes1());
	
	Revista r1 = new Revista("Mensal", "Maio");
	r1.setTitulo("Poggers");
	r1.setNumero(12);
	r1.setAno(1900);
	System.out.println(r1.detalhes());
	System.out.println(r1.detalhes1());

	
	Usuario u1 = new Usuario();
	u1.setNome("Joaozinho Gabrielzinho");
	u1.setId_usuario(1);
	
	u1.emprestarItem(r1);
	
	u1.emprestarItem(l1);
	
	
	}
	
	
}
