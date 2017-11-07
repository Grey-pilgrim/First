package First.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpPlusTest {
    private OpPlus opPlus;

    @Before
    public void setUp() throws Exception {
        opPlus = new OpPlus();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addPositiveNumbers() throws Exception {
        double actualResult = opPlus.exec(1, 8);
        Assert.assertTrue("Error", 9 == actualResult);
    }

}