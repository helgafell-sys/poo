package exercicio1;

public class Livro extends ItemBiblioteca {
        private String autor;
        private int numeroPaginas;
        private String isbn;

        public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas, String isbn) {
            super(titulo, anoPublicacao);
            this.autor = autor;
            this.numeroPaginas = numeroPaginas;
            this.isbn = isbn;
        }

        // Getters
        public String getAutor() {
            return autor;
        }

        public int getNumeroPaginas() {
            return numeroPaginas;
        }

        public String getIsbn() {
            return isbn;
        }


        public String detalhes() {
            return String.format("Livro: %s\nAutor: %s\nAno: %d\nPáginas: %d\nISBN: %s\nDisponível: %s",
                    getTitulo(), autor, getAnoPublicacao(), numeroPaginas, isbn,
                    isDisponivel() ? "Sim" : "Não");
        }
    }
