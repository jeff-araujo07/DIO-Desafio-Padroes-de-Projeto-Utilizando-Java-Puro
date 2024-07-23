package LabPadroesProjetoJava2.OneDigitalInnovationGof.singleton;

public class SingletonLibraryEager {

    private static SingletonLibraryEager instancia = new SingletonLibraryEager();

    private SingletonLibraryEager() {
        super();
    }

    public static SingletonLibraryEager getInstancia() {
        return instancia;
    }
}
