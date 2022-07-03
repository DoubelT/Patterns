package Singleton;

public class Koenig {

    private static final Koenig KOENIG = new Koenig();


    private final String name = "Georg der IV.";

    private Koenig(){
        System.out.println("Der König lebt für immer!");
    }

    public static Koenig getInstance(){
        return KOENIG;
    }

    @Override
    public String toString(){
        return this.name;
    }



}
