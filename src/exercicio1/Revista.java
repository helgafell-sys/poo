package exercicio1;

public class Revista extends ItemBiblioteca {
    private int numero;
    private String periodicidade;
    private String editora;

    public Revista(String titulo, int anoPublicacao, int numero, String periodicidade, String editora) {
        super(titulo, anoPublicacao);
        this.numero = numero;
        this.periodicidade = periodicidade;
        this.editora = editora;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public String getEditora() {
        return editora;
    }


    public String detalhes() {
        return String.format("Revista: %s\nNúmero: %d\nPeriodicidade: %s\nEditora: %s\nAno: %d\nDisponível: %s",
                getTitulo(), numero, periodicidade, editora, getAnoPublicacao(),
                isDisponivel() ? "Sim" : "Não");
    }
}