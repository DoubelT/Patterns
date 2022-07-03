package Iterator;

public class DemoIterator {

    public static void main(String[] args) {


        NaturalNumbers naturalNumbersV1 = new NaturalNumbers(13);

        NaturalNumbers naturalNumbersAll = new NaturalNumbers();



        while (naturalNumbersV1.hasNext()){
            System.out.print(naturalNumbersV1.next() + " ");
        }

        System.out.println();

        for (int i = 0; i <= 120000; i++) {
            System.out.print(naturalNumbersAll.next() + " ");
        }




    }
}
