package Visitor;

public class Klassensprecher implements Schueler {

    private final String name = "Bob";

    @Override
    public void visit(Mathe mathe) {
        System.out.println(name + " ist nie " +  mathe.imUnterricht());
    }

    @Override
    public void visit(Deutsch deutsch) {
        System.out.println(name + " ist nie " +  deutsch.imUnterricht());
    }
}
