package First.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpMinusTest {
    private OpMinus opMinus;

    @Before
    public void setUp() throws Exception {
        opMinus = new OpMinus();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addPositiveNumbers() throws Exception {
        double actualResult = opMinus.exec(8, 3);
        Assert.assertTrue("Error", 5 == actualResult);
    }

}