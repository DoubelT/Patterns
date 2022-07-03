package Visitor;

public class Mathe implements Faecher {


    @Override
    public void accept(Schueler schueler) {
        schueler.visit(this);
    }

    public String imUnterricht(){
        return "im Matheunterricht";
    }
}
