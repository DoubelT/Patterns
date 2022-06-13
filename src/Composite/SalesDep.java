package Composite;

public class SalesDep implements Department {
    private int id;
    private String name;

    public SalesDep(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
