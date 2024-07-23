package LabPadroesProjetoJava2.subsistema2.book;

public class BookApi {

    private static BookApi instancia = new BookApi();

    private BookApi() {
        super();
    }

    public static BookApi getInstancia() {
        return instancia;
    }

    public String recuperarAutor(String isbn) {
        // Simulação de recuperação de autor por ISBN
        return "Autor Exemplo";
    }

    public String recuperarEditora(String isbn) {
        // Simulação de recuperação de editora por ISBN
        return "Editora Exemplo";
    }
}
