package LabPadroesProjetoJava2.subsistema1.library;

public class LibraryService {

    private LibraryService() {
        super();
    }

    public static void adicionarLivro(String titulo, String isbn, String autor, String editora) {
        System.out.println("Livro adicionado ao sistema de biblioteca:");
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
    }
}