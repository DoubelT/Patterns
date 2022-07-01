package JUnitTesting;

import State.Demo;

import java.util.Objects;

public class DemoClass {


    private int holds;

    private boolean used;

    public DemoClass(int holds) {
        this.holds = holds;
        this.used = false;
    }

    public void setHolds(int input){
        if(!this.used){
            this.holds = input;
            this.used = true;
        }
    }

    public int getHolds(){
        return this.holds;
    }

    public boolean isUsed(){
        return this.used;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoClass demoClass = (DemoClass) o;
        return holds == demoClass.holds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(holds);
    }

    @Override
    public String toString(){
        return "[" + this.holds + "]";
    }


}
