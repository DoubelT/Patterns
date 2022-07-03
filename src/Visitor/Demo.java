package Visitor;

public class Demo {

    public static void main(String[] args) {

        RealSchueler realSchueler =new RealSchueler("Alice");

        Deutsch deutsch = new Deutsch();
        Mathe mathe = new Mathe();

        deutsch.accept(realSchueler);
        mathe.accept(realSchueler);

        System.out.println("----------------------------");

        Klassensprecher klassensprecher = new Klassensprecher();

        deutsch.accept(klassensprecher);
        mathe.accept(klassensprecher);

        klassensprecher.visit(mathe);



    }

}
