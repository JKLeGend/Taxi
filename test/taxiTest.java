/**
 * Created by jukzhang on 9/12/16.
 */
import oob.Taxi;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class taxiTest {
    Taxi taxi;
    final double PRECISION = 0.0001;
    @Before
    public void initialize() {
        taxi  = new Taxi();
    }
    @Test
    public void testTaxiCount0(){

        assertEquals(0,taxi.count(0), PRECISION);
    }

    @Test
    public void testTaxiCount1(){
        assertEquals(6,taxi.count(1), PRECISION);
    }

    @Test
    public void testTaxiCount2(){

        assertEquals(6,taxi.count(2), PRECISION);
    }

    @Test
    public void testTaxiCount3(){
        assertEquals(6.8,taxi.count(3), PRECISION);
    }
}
