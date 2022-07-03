package StatePattern;

public class Bereit extends Status {

    Bereit(Player player){
        super(player);
        player.setPlaying(false);
    }

    @Override
    String an() {
        player.setStatus(new An(player));
        return "Changed Bereit to An";
    }

    @Override
    String aus() {
        return "Still ready";
    }

    @Override
    String weiter() {
        player.setStatus(new Weiter(player));
        return "Changed from Bereit zu Weiter";
    }

    @Override
    String zurueck() {
        player.setStatus(new Zurueck(player));
        return "Changed from Bereit zu Zurück";

    }

    @Override
    public String toString() {
        return "Bereit{}";
    }
}
