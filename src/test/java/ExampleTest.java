import com.ahmetmesut.flatmap.Example;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ExampleTest {

    @Test
    public void testDoFlatMap() {
        List<String> result = Arrays.asList("groovy", "scala", "clojure", "go", "java", "javascript");
        assertThat(Example.doFlatMap(), is(equalTo(result)));
    }
}
