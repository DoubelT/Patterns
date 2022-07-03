package Visitor;

public class Deutsch implements Faecher {

    @Override
    public void accept(Schueler schueler) {
       schueler.visit(this);
    }


    public String imUnterricht(){
        return "im Deutschunterricht";
    }
}
