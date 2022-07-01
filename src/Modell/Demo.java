package Modell;

public class Demo {

    public static void main(String[] args) {


        Lager lager = new Lager();

        Produkt sack = new Sack("Luca");
        Produkt kanister = new Kanister(12000);
        Produkt flasche = new Flasche(1);


        lager.addToLager(sack);
        lager.addToLager(kanister);
        lager.addToLager(flasche);

        System.out.println(lager);



        Lager lager2 = new Lager();


        String input = "Kanister";

        switch (input){
            case "Kanister" -> lager2.addToLager(new Kanister(12000));
            case "Sack" -> lager2.addToLager(new Sack("Luca"));
            case "Flasche" -> lager2.addToLager(new Flasche(1));
            default -> throw new IllegalArgumentException();
        }

        System.out.println(lager2);






    }

}
