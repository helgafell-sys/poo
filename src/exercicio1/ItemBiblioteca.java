package exercicio1;

// Classe base abstrata para itens da biblioteca
public abstract class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    // Métodos getters e setters
 // Métodos getters e setters
    public String getTitulo() {

        return titulo;
    }

    public int getAnoPublicacao() {

        return anoPublicacao;
    }

    public boolean isDisponivel() {

        return disponivel;
    }

    protected void setDisponivel(boolean disponivel) {

        this.disponivel = disponivel;
    }


    // Métodos para empréstimo e devolução
    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponivel = true;
    }

    // Metodo abstrato para detalhes do item
    public abstract String detalhes();
}