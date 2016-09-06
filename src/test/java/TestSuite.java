import com.ahmetmesut.java8.SampleOne;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FizzBuzzTest.class,
        NumberTest.class,
        BookTest.class,
        SampleOneTest.class
})
public class TestSuite {
}
