import com.ahmetmesut.tdd.PrimeNumber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrimeNumberTest {

    private Integer inputNumber;
    private Boolean expected;
    private PrimeNumber primeNumber;

    @Before
    public void initialize(){
        primeNumber = new PrimeNumber();
    }

    public PrimeNumberTest(Integer inputNumber,Boolean expected){
        this.inputNumber = inputNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return Arrays.asList(new Object[][]{
                {2,true},{6,false},{10,false},{7,true},{23,true}
        });
    }

    @Test
    public void primeCheck(){
        assertEquals(expected,primeNumber.check(inputNumber));
    }
}
