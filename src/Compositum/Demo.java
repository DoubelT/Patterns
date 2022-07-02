package Compositum;

public class Demo {

    public static void main(String[] args) {

        Soldat soldat1 = new Soldat();
        soldat1.setDg("HG");
        soldat1.setName("Hans");
        soldat1.setNummer(1);

        Soldat soldat2 = new Soldat();
        soldat2.setDg("Fhj");
        soldat2.setName("Paul");
        soldat2.setNummer(2);

        Soldat soldat3 = new Soldat();
        soldat3.setDg("Lt");
        soldat3.setName("Petzer");
        soldat3.setNummer(3);



        Kompanie kompanie = new Kompanie();
        kompanie.setKompanie(1);

        kompanie.addSoldats(soldat1);

        kompanie.addSoldats(soldat2);

        kompanie.addSoldats(soldat3);

        System.out.println(kompanie);



    }
}
