package JUnitTesting.Test;

import JUnitTesting.DemoClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DemoClassTest {

    @Before
    public void before(){
        DemoClass demoClass = new DemoClass(5);
    }



    @Test
    public void testUnset(){
        DemoClass demoClass = new DemoClass(5);
        assertFalse(demoClass.isUsed());
    }

    @Test
    public void testSet(){
        DemoClass demoClass = new DemoClass(5);
        demoClass.setHolds(0);
        assertEquals(demoClass.toString(), "[0]");
        assertTrue(demoClass.isUsed());
    }

}
