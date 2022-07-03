import java.util.Objects;

public class Beispiel {

    private final int holder;

    public Beispiel(int input){
        this.holder = input;
    }




    @Override
    public String toString(){
        return "Holds: " +  holder;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(holder);
    }


    @Override
    public boolean equals(Object toCompare){
        if(this == toCompare) return true;
        if(toCompare == null || getClass() != toCompare.getClass()) return false;
        Beispiel toComp = (Beispiel) toCompare;
        return toComp.holder == this.holder;

    }


}
