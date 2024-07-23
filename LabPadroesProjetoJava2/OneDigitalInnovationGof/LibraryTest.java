package LabPadroesProjetoJava2.OneDigitalInnovationGof;

import LabPadroesProjetoJava2.OneDigitalInnovationGof.facade.LibraryFacade;
import LabPadroesProjetoJava2.OneDigitalInnovationGof.singleton.SingletonLibraryEager;
import LabPadroesProjetoJava2.OneDigitalInnovationGof.singleton.SingletonLibraryLazy;
import LabPadroesProjetoJava2.OneDigitalInnovationGof.singleton.SingletonLibraryLazyHolder;
import LabPadroesProjetoJava2.OneDigitalInnovationGof.strategy.Book;
import LabPadroesProjetoJava2.OneDigitalInnovationGof.strategy.BookBehavior;
import LabPadroesProjetoJava2.OneDigitalInnovationGof.strategy.BookBehaviorFiccao;
import LabPadroesProjetoJava2.OneDigitalInnovationGof.strategy.BookBehaviorTecnologia;
import LabPadroesProjetoJava2.OneDigitalInnovationGof.strategy.BookBehaviorHistorico;

public class LibraryTest {

    public static void main(String[] args) {

        // Singleton

        SingletonLibraryLazy lazy = SingletonLibraryLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLibraryLazy.getInstancia();
        System.out.println(lazy);

        SingletonLibraryEager eager = SingletonLibraryEager.getInstancia();
        System.out.println(eager);
        eager = SingletonLibraryEager.getInstancia();
        System.out.println(eager);

        SingletonLibraryLazyHolder lazyHolder = SingletonLibraryLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLibraryLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        BookBehavior ficcao = new BookBehaviorFiccao();
        BookBehavior tecnologia = new BookBehaviorTecnologia();
        BookBehavior historico = new BookBehaviorHistorico();

        Book book = new Book();
        book.setBehavior(ficcao);
        book.exibir();
        book.setBehavior(tecnologia);
        book.exibir();
        book.setBehavior(historico);
        book.exibir();

        // Facade

        LibraryFacade facade = new LibraryFacade();
        facade.adicionarLivro("O Senhor dos Anéis", "978-0261103573");
    }
}
