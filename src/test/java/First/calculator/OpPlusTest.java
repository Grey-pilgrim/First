package First.calculator;

import org.junit.Assert;
import org.junit.Before;

public class OpPlusTest {
    private OpPlus opPlus;

    @Before
    public void setUp() throws Exception {
        opPlus = new OpPlus();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addPositiveNumbers() throws Exception {
        double actualResult = opPlus.exec(1, 8);
        Assert.assertTrue("Error", 9 == actualResult);
    }

}