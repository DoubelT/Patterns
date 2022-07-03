package Clock;

public class setSeconds extends State {



    @Override
    void up() {
        timer.setTime(timer.getTime() + 1);
    }

    @Override
    void down() {
        timer.setTime(Math.toIntExact(Math.max(timer.getTime() - 1,0)));
    }

    @Override
    void mode() {
        timer.setState(timer.setMinutes);
    }

    @Override
    boolean isRunning() {
        return false;
    }
}
