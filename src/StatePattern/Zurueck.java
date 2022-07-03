package StatePattern;

public class Zurueck extends Status {
    Zurueck(Player player) {
        super(player);
        System.out.println("Changed song to next song. Do anything to proceed!");
    }

    @Override
    String an() {
        player.setStatus(new Bereit(player));
        return "Changed from Zurück zu Bereit";
    }

    @Override
    String aus() {
        player.setStatus(new Bereit(player));
        return "Changed from Zurück zu Bereit";
    }

    @Override
    String weiter() {
        player.setStatus(new Bereit(player));
        return "Changed from Zurück zu Bereit";
    }

    @Override
    String zurueck() {
        player.setStatus(new Bereit(player));
        return "Changed from Zurück zu Bereit";
    }

    @Override
    public String toString() {
        return "Zurueck{}";
    }
}
