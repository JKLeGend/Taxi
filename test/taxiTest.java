/**
 * Created by jukzhang on 9/12/16.
 */
import oob.Taxi;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class taxiTest {
    @Test
    public void testTaxi(){
        Taxi taxi = new Taxi();
        assertEquals(0,taxi.count(0));

    }
}
