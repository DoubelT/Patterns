package StatePattern;

public abstract class Status {

    Player player;

    Status(Player player){
        this.player = player;
    }


    abstract String an();
    abstract String aus();
    abstract String weiter();
    abstract String zurueck();


}
