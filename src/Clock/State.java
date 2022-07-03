package Clock;

public abstract class State {


    Timer timer = new Timer();

    void tick(){};

    void up(){};

    void down(){};

    void mode(){};

    void start(){};

    boolean isBeeping(){
        return false;
    }

    boolean isRunning(){
        return false;
    }

}
