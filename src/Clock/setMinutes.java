package Clock;

public class setMinutes extends State {

    void up(){
        timer.setTime(timer.getTime() + 60);

    }

    void down(){
        timer.setTime(Math.max(0, timer.getTime()-60));
    }

    @Override
    void mode() {
        timer.setState(timer.setSeconds);
    }

    @Override
    void start() {
        timer.setEndTime(timer.currentTime() + timer.getTime() * Timer.ONE_SEC);
        timer.setState(timer.countDown);
    }
}
