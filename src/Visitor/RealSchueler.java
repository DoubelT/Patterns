package Visitor;

public class RealSchueler implements Schueler {

    private final String name;

    public RealSchueler(String name) {
        this.name = name;
    }

    @Override
    public void visit(Mathe mathe) {
        System.out.println("Der Schüler ist " + mathe.imUnterricht());
    }

    @Override
    public void visit(Deutsch deutsch) {
        System.out.println("Der Schüler ist " + deutsch.imUnterricht());
    }
}
