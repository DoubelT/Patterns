package Compositum;

import java.util.ArrayList;
import java.util.Arrays;

public class Kompanie extends Einheit {
    private int Kompanie;

    private final ArrayList<Soldat> soldats = new ArrayList<>();

    public void setKompanie(int kompanie) {
        Kompanie = kompanie;
    }

    public int getKompanie() {
        return Kompanie;
    }

    public void addSoldats(Soldat soldat){
        soldats.add(soldat);
    }

    public String toString(){
        StringBuilder bob = new StringBuilder();
        bob.append("This is Kompanie ").append(getKompanie()).append(".").append(System.lineSeparator());


        for (Soldat soldat:soldats) {
            bob.append("Soldier: ").append(soldat.getName()).append(" has Rank: ").append(soldat.getDg()).append(".").append(System.lineSeparator());
        }
        return bob.toString();
    }
}
