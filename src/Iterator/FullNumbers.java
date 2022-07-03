package Iterator;

import java.util.Iterator;

public class FullNumbers implements Iterable<Long> {


    private long curr = Long.MIN_VALUE;
    private long to = Long.MAX_VALUE;


    public FullNumbers(){};

    public FullNumbers(long from, long to){
        curr = from;
        this.to = to;
    }


    @Override
    public Iterator<Long> iterator() {

        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return curr <= to;
            }

            @Override
            public Long next() {
                return curr++;
            }
        };



    }
}
