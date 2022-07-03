package ClockBroken;

public class CountingDown extends State {


    void tick(){
        if(timer.currentTime() >= timer.getEndTime()){
            timer.setEndTime(timer.currentTime() + 5 * Timer.ONE_SEC);
        }
        timer.setTime(Math.toIntExact((timer.getEndTime() - timer.currentTime() / Timer.ONE_SEC)));
    }

    void start(){
        timer.setTime(Math.toIntExact((timer.getEndTime() - timer.currentTime() / Timer.ONE_SEC)));
        timer.setState(timer.setSeconds);
    }

    @Override
    boolean isRunning() {
        return true;
    }
}
