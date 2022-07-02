package JUnitTesting.Test;

import JUnitTesting.DemoClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DemoClassTest {
    private DemoClass demoClass;
    @Before
    public  void before(){
         this.demoClass = new DemoClass(5);
    }



    @Test
    public void testUnset(){
        assertFalse(demoClass.isUsed());
    }

    @Test
    public void testSet(){
        demoClass.setHolds(0);
        assertEquals(demoClass.toString(), "[0]");
        assertTrue(demoClass.isUsed());
    }

}
