package ClockBroken;

public class Timer {

    private int time = 0;

    private long endTime = 0L;

    protected final static long ONE_SEC = 1000000000L;

    final State setSeconds = new setSeconds();
    final State setMinutes = new setMinutes();

    final State ring = new Ring();

    final State countDown = new CountingDown();

    private State state = setSeconds;


    public int getTime() {
        return time;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    long getEndTime(){
        return endTime;
    }

    void tick(){
        state.tick();
    }

    void up(){
        state.up();
    }

    void down(){
        state.down();
    }

    void start(){
        state.start();
    }

    void mode(){
        state.mode();
    }

    boolean isBeeping(){
        return state.isBeeping();
    }

    boolean isRunning(){
        return state.isRunning();
    }

    long currentTime(){
        return System.nanoTime();
    }

    public String toString(){
        if(isBeeping()) return "Beep";
        return String.format("%02d:%02d", time / 60, time % 60);
    }





}
