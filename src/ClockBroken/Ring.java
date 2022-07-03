package ClockBroken;

public class Ring extends State {

    void tick(){
        if( timer.currentTime() >= timer.getEndTime()){
            timer.setTime(0);
            timer.setState(timer.setSeconds);
        }
    }

    @Override
    boolean isBeeping() {
        return true;
    }

    @Override
    boolean isRunning() {
        return true;
    }
}
