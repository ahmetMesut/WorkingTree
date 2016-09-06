import com.ahmetmesut.java8.SampleOne;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SampleOneTest {

    @Test
    public void testPrintEven(){
        List<String> result = Arrays.asList("Ahmet2","Ahmet4","Ahmet6","Ahmet8");
        assertThat(SampleOne.printEven(),is(equalTo(result)));
    }

    @Test
    public void testReduceOperation(){
        assertThat(SampleOne.reduceSum(),is(equalTo(55)));
    }

    @Test
    public void testDoSorted(){
        List<Integer> result = Arrays.asList(-1,0,1,2,3,6,9);
        assertThat(SampleOne.doSorted(),is(equalTo(result)));
    }

    @Test
    public void testSort(){
        List<String> result = Arrays.asList("anna","mike","peter","xenia");
        assertThat(SampleOne.sort(),is(equalTo(result)));
    }

    @Test
    public void testDoConvert(){
        assertThat(SampleOne.doConvert(),is(equalTo(123)));
    }
    @Test
    public void testDoSomething(){
        List<String> result = Arrays.asList("spring","node");
        assertThat(SampleOne.doSomething(),is(equalTo(result)));
    }

    @Test
    public void testFilterMapFindAnyOrElse(){
        assertThat(SampleOne.filterMapFindAnyOrElse(),is(equalTo("Ahmet")));
    }

    @Test
    public void testDoFunction(){
        assertThat(SampleOne.doFunction(),is(equalTo("12")));
    }
}
