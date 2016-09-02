import com.ahmetmesut.singlesponsibility.IPrinter;
import com.ahmetmesut.singlesponsibility.PrinterImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class IPrinterTest {

    public IPrinter iPrinter;


    public IPrinterTest(IPrinter iPrinter){
        this.iPrinter = iPrinter;
    }

    @Parameterized.Parameters
    public static Collection<Object> instanceTest(){
        return Arrays.asList(new Object[]{new PrinterImpl()});
    }

    @Test
    public void testPrintPage(){
        assertThat(iPrinter.printPage("page"),is(equalTo("page")));
    }
}
