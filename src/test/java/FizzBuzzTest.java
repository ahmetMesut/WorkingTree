import com.ahmetmesut.tdd.FizzBuzz;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void test(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        //assertion
        assertEquals("fizz",fizzBuzz.division(3));
        assertEquals("buzz",fizzBuzz.division(5));
        assertEquals("fizzbuzz",fizzBuzz.division(15));

        //assertThat
        assertThat(fizzBuzz.division(15),is(equalTo("fizzbuzz")));
        assertThat(fizzBuzz.division(15),is(not(equalTo("fizz"))));
        assertThat(fizzBuzz.division(15),is(not(equalTo("buzz"))));
    }
}
