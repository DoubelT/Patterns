package StatePattern;

public class An extends Status {
    An(Player player) {
        super(player);
        System.out.println("Playing");
    }

    @Override
    String an() {
        return "Playing";
    }

    @Override
    String aus() {
        player.setStatus(new Bereit(player));
        return "Changed from Aus to Bereit";
    }

    @Override
    String weiter() {
        return "Playing";
    }

    @Override
    String zurueck() {
        return "Playing";
    }

    @Override
    public String toString() {
        return "An{}";
    }
}
