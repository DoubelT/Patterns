package Iterator;

import java.util.Iterator;

public class NaturalNumbers implements Iterator<Long> {

    private long current = 0;
    private long maxValue = Long.MAX_VALUE;

    public NaturalNumbers(){

    }

    public NaturalNumbers(long obereSchranke){
        this.maxValue = obereSchranke;
    }

    @Override
    public boolean hasNext() {
        return current <= maxValue;
    }

    @Override
    public Long next() {
        Long ret = null;
        if(this.hasNext()){
            ret = current;
            current++;
        }
        return ret;
    }
}
