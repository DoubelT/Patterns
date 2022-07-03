package Klausur2021Juli;

import java.util.HashSet;

public class World {

    private final HashSet<Location> locationHashSet = new HashSet<>();



    public World(){};


    public void addToHashSet(Location loc){locationHashSet.add(loc);}

}
