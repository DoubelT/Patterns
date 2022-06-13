package Composite;

public class demo {

    public static void main(String[] args) {

        HeadDep headDep = new HeadDep(1,"Head");

        FinancialDep financialDep = new FinancialDep(2, "Finance");

        SalesDep salesDep = new SalesDep(3, "Sales");

        headDep.addDepartment(financialDep);
        headDep.addDepartment(salesDep);

        headDep.printDepartmentName();
        headDep.remDepartment(financialDep);

        headDep.printDepartmentName();


    }
}
