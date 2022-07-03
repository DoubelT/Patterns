public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Beispiel beispiel1 = new Beispiel(1);
        Beispiel beispiel1_1 = new Beispiel(1);
        Beispiel beispiel2 = new Beispiel(2);

        System.out.println(beispiel2.equals(beispiel1));

        System.out.println(beispiel1.equals(beispiel1_1));


    }
}