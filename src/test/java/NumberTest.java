
import com.ahmetmesut.tdd.Number;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class NumberTest {

    @Test
    public void findHighestTest() {
        assertEquals(87, Number.findHighestNumber(new int[]{52, 87, 68, 72}));
    }

    @Test
    public void sumListItemTest(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(15);
        numbers.add(14);
        numbers.add(7);

        assertEquals(48,Number.sumListItem(numbers));
    }

}
