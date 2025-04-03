package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final String nome;
    private final int idUsuario;
    private final List<ItemBiblioteca> itensEmprestados;
    private int limiteEmprestimos;
    private boolean bloqueado;

    // Construtor
    public Usuario(String nome, int idUsuario) {
        this(nome, idUsuario, 5); // Limite padrão de 5 empréstimos
    }

    // Construtor com limite personalizado
    public Usuario(String nome, int idUsuario, int limiteEmprestimos) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do usuário não pode ser vazio");
        }
        if (idUsuario <= 0) {
            throw new IllegalArgumentException("ID do usuário deve ser positivo");
        }
        if (limiteEmprestimos <= 0) {
            throw new IllegalArgumentException("Limite de empréstimos deve ser positivo");
        }

        this.nome = nome;
        this.idUsuario = idUsuario;
        this.itensEmprestados = new ArrayList<>();
        this.limiteEmprestimos = limiteEmprestimos;
        this.bloqueado = false;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public List<ItemBiblioteca> getItensEmprestados() {
        return new ArrayList<>(itensEmprestados); // Retorna cópia defensiva
    }

    // Setters com validação
    public void setLimiteEmprestimos(int novoLimite) {
        if (novoLimite <= 0) {
            throw new IllegalArgumentException("Limite de empréstimos deve ser positivo");
        }
        this.limiteEmprestimos = novoLimite;
    }

    public void bloquear() {
        this.bloqueado = true;
    }

    public void desbloquear() {
        this.bloqueado = false;
    }

    // Métodos de negócio
    public boolean podeEmprestar() {
        return !bloqueado && itensEmprestados.size() < limiteEmprestimos;
    }

    public boolean emprestarItem(ItemBiblioteca item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }

        if (!podeEmprestar()) {
            return false;
        }

        if (item.isDisponivel() && item.emprestar()) {
            itensEmprestados.add(item);
            return true;
        }
        return false;
    }

    public boolean devolverItem(ItemBiblioteca item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }

        if (itensEmprestados.contains(item)) {
            item.devolver();
            itensEmprestados.remove(item);
            return true;
        }
        return false;
    }

    public boolean possuiItem(ItemBiblioteca item) {
        return itensEmprestados.contains(item);
    }

    public int getQuantidadeItensEmprestados() {
        return itensEmprestados.size();
    }

    public void listarItensEmprestados() {
        if (itensEmprestados.isEmpty()) {
            System.out.println(nome + " não possui itens emprestados no momento.");
            return;
        }

        System.out.println("Itens emprestados por " + nome + ":");
        System.out.println("Limite: " + itensEmprestados.size() + "/" + limiteEmprestimos);
        System.out.println("Status: " + (bloqueado ? "BLOQUEADO" : "ATIVO"));
        System.out.println("----------------------------------");

        for (ItemBiblioteca item : itensEmprestados) {
            System.out.println(item.detalhes());
            System.out.println("----------------------------------");
        }
    }


    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", id=" + idUsuario +
                ", emprestimos=" + itensEmprestados.size() +
                "/" + limiteEmprestimos +
                ", status=" + (bloqueado ? "bloqueado" : "ativo") +
                '}';
    }
}