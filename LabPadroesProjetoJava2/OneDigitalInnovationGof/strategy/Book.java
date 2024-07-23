package LabPadroesProjetoJava2.OneDigitalInnovationGof.strategy;

public class Book {

    private BookBehavior behavior;

    public void setBehavior(BookBehavior behavior) {
        this.behavior = behavior;
    }

    public void exibir() {
        behavior.exibir();
    }
}
