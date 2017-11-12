package First.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpDivisionTest {
    private OpDivision opDivision;


    @Before
    public void setUp() throws Exception {
        opDivision = new OpDivision();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addPositiveNumbers() throws Exception {
        double actualResult = opDivision.exec(8, 4);
        Assert.assertTrue("Error", 2 == actualResult);
    }

}