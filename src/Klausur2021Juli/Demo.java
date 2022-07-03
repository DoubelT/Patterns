package Klausur2021Juli;

public class Demo {
    public static void main(String[] args) {
        Location loc1 = new Location(1,1);
        Location loc2 = new Location(2,2);

        Location loc3 = new Location(1,1);


        World world = new World();

        world.addToHashSet(loc1);
        world.addToHashSet(loc2);
        world.addToHashSet(loc3);

        System.out.println("HALP");
    }





}
