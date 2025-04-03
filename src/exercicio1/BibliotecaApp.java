package exercicio1;

public class BibliotecaApp {
	
	
    public static void main(String[] args) {
        // Criando alguns itens
        Livro livro1 = new Livro("Dom Casmurro", 1899, "Machado de Assis", 256, "978-85-7232-000-0");
        Revista revista1 = new Revista("Veja", 2023, 2835, "Semanal", "Abril");

        // Criando usuário
        Usuario usuario1 = new Usuario("João Silva", 1);

        // Emprestando itens
        System.out.println("Tentando emprestar itens...");
        if (usuario1.emprestarItem(livro1)) {
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não foi possível emprestar o livro.");
        }

        if (usuario1.emprestarItem(revista1)) {
            System.out.println("Revista emprestada com sucesso!");
        } else {
            System.out.println("Não foi possível emprestar a revista.");
        }

        // Tentando emprestar o mesmo livro novamente
        if (usuario1.emprestarItem(livro1)) {
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não foi possível emprestar o livro (já está emprestado).");
        }

        // Listando itens emprestados
        System.out.println("\nItens emprestados:");
        usuario1.listarItensEmprestados();

        // Devolvendo um item
        System.out.println("\nDevolvendo o livro...");
        if (usuario1.devolverItem(livro1)) {
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Não foi possível devolver o livro.");
        }

        // Listando itens emprestados após devolução
        System.out.println("\nItens emprestados após devolução:");
        usuario1.listarItensEmprestados();
    }
}