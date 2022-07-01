package Modell;

public class Kanister extends Produkt{


    private final Double inhalt;

    public Kanister(double inhaltInLitres) {
        if(inhaltInLitres <= 0) throw new IllegalArgumentException("Kanister cannot store <= 0");
        this.inhalt = inhaltInLitres/1000;
    }
}
