package LabPadroesProjetoJava2.OneDigitalInnovationGof.singleton;

public class SingletonLibraryLazyHolder {

    private static class InstanceHolder {
        public static SingletonLibraryLazyHolder instancia = new SingletonLibraryLazyHolder();
    }

    private SingletonLibraryLazyHolder() {
        super();
    }

    public static SingletonLibraryLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}