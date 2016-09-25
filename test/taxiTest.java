/**
 * Created by jukzhang on 9/12/16.
 */

import oob.Taxi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class taxiTest {
    Taxi taxi;
    final double PRECISION = 0.0001;

    @Before
    public void initialize() {
        taxi = new Taxi();
    }

    @Test
    public void testTaxiCounterWithMiles0() {
        assertEquals(0, taxi.counter(0, 0), PRECISION);
        assertEquals(0, taxi.counter(0, 4), PRECISION);
    }

    @Test
    public void testTaxiCounterWithMiles1() {
        assertEquals(6, taxi.counter(1, 0), PRECISION);
        assertEquals(7, taxi.counter(1, 4), PRECISION);
    }

    @Test
    public void testTaxiCounterWithMiles2() {
        assertEquals(6, taxi.counter(2, 0), PRECISION);
        assertEquals(7, taxi.counter(2, 4), PRECISION);
    }

    @Test
    public void testTaxiCounterWithMiles3() {
        assertEquals(7, taxi.counter(3, 0), PRECISION);
        assertEquals(8, taxi.counter(3, 4), PRECISION);
    }

    @Test
    public void testTaxiCounterWithMiles5() {
        assertEquals(8, taxi.counter(5, 0), PRECISION);
        assertEquals(9, taxi.counter(5, 4), PRECISION);
    }

    @Test
    public void testTaxiCounterWithMiles8() {
        assertEquals(11, taxi.counter(8, 0), PRECISION);
        assertEquals(12, taxi.counter(8, 4), PRECISION);
    }

    @Test
    public void testTaxiCounterWithMiles9() {
        assertEquals(12, taxi.counter(9, 0), PRECISION);
        assertEquals(13, taxi.counter(9, 4), PRECISION);
    }

    @Test
    public void testTaxiCounterWithMiles99() {
        assertEquals(120, taxi.counter(99, 0), PRECISION);
        assertEquals(121, taxi.counter(99, 4), PRECISION);
    }

    @Test
    public void testTaxiBasicFeeCounter() {
        assertEquals(1.6, taxi.basicFeeCounter(4), PRECISION);
    }

    @Test
    public void testTaxiExtraFeeCounter() {
        assertEquals(0.8, taxi.extraFeeCounter(10), PRECISION);
    }

    @Test
    public void testTaxiTimeCharger() {
        assertEquals(2, taxi.timeCharger(4), PRECISION);
    }

    @Test
    public void testTaxiPriceCounter() {
        assertEquals(1, taxi.priceRounder(1.2), PRECISION);
        assertEquals(2, taxi.priceRounder(1.5), PRECISION);
    }
}
