import org.junit.Test;

import java.util.ArrayList;

public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void testDivisionException(){
        int i = 1/0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList(){
        new ArrayList<>().get(0);
    }

}
