package LabPadroesProjetoJava2.OneDigitalInnovationGof.singleton;

public class SingletonLibraryLazy {

    private static SingletonLibraryLazy instancia;

    private SingletonLibraryLazy() {
        super();
    }

    public static SingletonLibraryLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLibraryLazy();
        }
        return instancia;
    }
}