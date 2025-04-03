package exercicio1;

import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private int id_usuario;
	private ArrayList<ItemBiblioteca> itensEmprestados
					= new ArrayList<ItemBiblioteca>();
	
	public boolean emprestarItem(ItemBiblioteca item) {
		return true;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	
	
}
