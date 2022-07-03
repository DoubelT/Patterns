package StatePattern;

public class Player {

    private boolean playing;

    private Status status;

    public Player(boolean playing) {
        this.playing = playing;
        this.status = new Bereit(this);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

}
