package VisitorNumbers;

public class NNumbers implements Visitor {

    private int lastOp;
    @Override
    public int visit(Add add) {
        lastOp = add.num1() + add.num2();
        return add.num1() + add.num2();
    }

    @Override
    public int visit(Sub sub) {
        lastOp = sub.num1() - sub.num2();
        return sub.num1() - sub.num2();
    }

    @Override
    public String toString(){
        return Integer.toString(lastOp);
    }
}
