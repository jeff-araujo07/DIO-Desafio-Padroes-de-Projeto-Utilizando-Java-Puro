package LabPadroesProjetoJava2.OneDigitalInnovationGof.facade;

import LabPadroesProjetoJava2.subsistema1.library.LibraryService;
import LabPadroesProjetoJava2.subsistema2.book.BookApi;

public class LibraryFacade {

    public void adicionarLivro(String titulo, String isbn) {
        String autor = BookApi.getInstancia().recuperarAutor(isbn);
        String editora = BookApi.getInstancia().recuperarEditora(isbn);

        LibraryService.adicionarLivro(titulo, isbn, autor, editora);
    }
}
