package Singleton;



public class DemoSingleton {

    static Koenig current = Koenig.getInstance();

    public static void main(String[] args) {
        System.out.println(current);
    }



}
