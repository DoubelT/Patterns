package VisitorNumbers;

public record Sub(int num1, int num2) implements Op {

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return num1 + " - " + num2;
    }
}
