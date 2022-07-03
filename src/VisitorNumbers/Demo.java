package VisitorNumbers;



public class Demo {

    public static void main(String[] args) {
        Add add = new Add(1,2);

        NNumbers nNumbers = new NNumbers();

        System.out.println(add + " = " + add.accept(nNumbers));


    }

}
