package Composite;

public class FinancialDep implements Department {

    private int id;
    private String name;

    public FinancialDep(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
