package Klausur2021Juli;

import java.util.Iterator;
import java.util.Objects;

public class Location implements Comparable<Location> {

    private final int x;
    private final int y;
    private final int z;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
        this.z = -x -y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x && y == location.y && z == location.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public int compareTo(Location location) {
        return 0;
    }

    public Iterator<Location> iterator(){

        Iterator<Location> locationIterator = new Iterator<Location>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Location next() {
                return null;
            }
        };

        return locationIterator;

    }
}
