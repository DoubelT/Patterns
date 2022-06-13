package Composite;

import java.util.ArrayList;

public class HeadDep implements Department {
    private int id;
    private String name;

    private final ArrayList<Department> subDepartments;

    public HeadDep(int id, String name) {
        this.id = id;
        this.name = name;
        this.subDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        subDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department toAdd){
        subDepartments.add(toAdd);
    }

    public void remDepartment(Department toRemove){
        subDepartments.remove(toRemove);
    }
}
