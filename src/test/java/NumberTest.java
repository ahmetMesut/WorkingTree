import com.ahmetmesut.tdd.Number;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class NumberTest {


    @Test
    public void findHighestTest() {
        assertEquals(87, Number.findHighestNumber(new int[]{52, 87, 68, 72}));
    }


    List<Integer> list = new ArrayList<>();

    @Test
    public void sumListItemTest() {
        list.add(12);
        list.add(15);
        list.add(14);
        list.add(7);

        //assertion
        assertEquals(48, Number.sumListItem(list));

        //assertThat
        assertThat(Number.sumListItem(list),is(equalTo(48)));
        assertThat(Number.sumListItem(list),is(not(equalTo(50))));
    }
}
