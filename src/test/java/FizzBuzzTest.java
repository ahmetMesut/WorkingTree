import com.ahmetmesut.kata.FizzBuzz;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void divisible_3_as_fizz(){
        assertThat(fizzBuzz.classify(3),is(fizzBuzz.FIZZ));
        assertThat(fizzBuzz.classify(6),is("fizz"));
    }

    @Test
    public void divisible_5_as_buzz(){
        assertThat(fizzBuzz.classify(5),is(fizzBuzz.BUZZ));
    }
    @Test
    public void divisible_both_3_and_5_as_fizzBuzz(){
        assertThat(fizzBuzz.classify(15),is(fizzBuzz.FIZZ+fizzBuzz.BUZZ));
    }
    @Test
    public void divisible_neither_3_nor_5_as_fizzBuzz(){
        assertThat(fizzBuzz.classify(17),is("17"));
    }

}
