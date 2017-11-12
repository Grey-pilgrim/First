package First.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpMultiplyTest {
    private OpMultiply opMultiply;

    @Before
    public void setUp() throws Exception {
        opMultiply = new OpMultiply();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addPositiveNumbers() throws Exception {
        double actualResult = opMultiply.exec(3, 3);
        Assert.assertTrue("Error", 9 == actualResult);
    }

}