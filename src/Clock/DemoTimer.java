package Clock;

public class DemoTimer {

    public static void main(String[] args) {
        Timer timer = new Timer();

        //5Sec
        timer.up();
        timer.up();
        timer.up();
        timer.up();
        timer.up();

        //1Min
        timer.mode();
        timer.up();

        timer.start();

    }



}
