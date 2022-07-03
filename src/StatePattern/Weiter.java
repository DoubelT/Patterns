package StatePattern;

public class Weiter extends Status {



    Weiter(Player player) {
        super(player);
        System.out.println("Changed song to next song. Do anything to proceed!");

    }



    @Override
    String an() {
        player.setStatus(new Bereit(player));
        return "Changed from Weiter zu Bereit";
    }

    @Override
    String aus() {
        player.setStatus(new Bereit(player));
        return "Changed from Weiter zu Bereit";
    }

    @Override
    String weiter() {

        player.setStatus(new Bereit(player));
        return "Changed from Weiter zu Bereit";
    }

    @Override
    String zurueck() {

        player.setStatus(new Bereit(player));
        return "Changed from Weiter zu Bereit";
    }

    @Override
    public String toString() {
        return "Weiter{}";
    }
}
