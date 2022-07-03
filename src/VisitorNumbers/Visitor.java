package VisitorNumbers;

public interface Visitor {

    int visit(Add add);

    int visit(Sub sub);


}
