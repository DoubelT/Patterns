package Modell;

import java.util.ArrayList;

public class Lager {


    private final ArrayList<Produkt> lager = new ArrayList<>();

    public Lager() {
    }


    public void addToLager(Produkt toPutInLager){
        if(toPutInLager == null) throw new IllegalArgumentException("Input was Null");
        lager.add(toPutInLager);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Lager: ");
        builder.append(System.lineSeparator());

        for (Produkt prod:lager) {
            builder.append(prod.getClass());
            builder.append(System.lineSeparator());
        }

        return builder.toString();

    }
}
