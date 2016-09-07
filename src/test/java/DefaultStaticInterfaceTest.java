import com.ahmetmesut.java8.DefaultStaticInterface;
import com.ahmetmesut.java8.DefaultStaticInterfaceImpl;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class DefaultStaticInterfaceTest {

    public DefaultStaticInterface defaultStaticInterface;

    @Before
    public void init(){
        defaultStaticInterface = new DefaultStaticInterfaceImpl();
    }

    public DefaultStaticInterfaceTest(DefaultStaticInterface defaultStaticInterface){
        this.defaultStaticInterface = defaultStaticInterface;
    }

    @Parameterized.Parameters
    public static Collection<Object> test(){
        return Arrays.asList(new Object[]{new DefaultStaticInterfaceImpl()});
    }

    @Test
    public void testDefaultStaticInterface(){
        assertThat(defaultStaticInterface.div(16,4), is(equalTo(4.0)));
    }
    @Test
    public void test1(){
        assertThat(DefaultStaticInterface.sum(8,6),is(equalTo(14)));
    }
}
