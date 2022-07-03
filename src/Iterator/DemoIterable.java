package Iterator;

public class DemoIterable {

    public static void main(String[] args) {


        FullNumbers fullNumbers = new FullNumbers(0,20);

        for (long num:fullNumbers) {
            System.out.println(num);
        }



    }

}
