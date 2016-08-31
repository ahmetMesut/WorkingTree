
import com.ahmetmesut.tdd.Number;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NumberTest {

    @Test
    public void findHighestTest() {
        assertEquals(87, Number.findHighestNumber(new int[]{52, 87, 68, 72}));
    }

}
