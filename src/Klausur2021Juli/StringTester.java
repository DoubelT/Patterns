package Klausur2021Juli;

import java.util.Objects;

public class StringTester {

    private Location name;


    public StringTester(Location input){
        this.name = input;
    }

    public int hashCode(){
        return Objects.hashCode(name);
    }

}
