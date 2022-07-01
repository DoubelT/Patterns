package Modell;

public class Flasche extends Produkt{


    private final Double litres;

    public Flasche(double litres) {
        if(litres <= 0) throw new IllegalArgumentException();
        this.litres = litres;
    }
}
