package First.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyOpFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getOpInstancePlus() throws Exception {
        Object operation = new MyOpFactory().getOpInstance(1);

        Assert.assertTrue("Ошибка операции", (operation instanceof OpPlus));
    }
    @Test
    public void getOpInstanceNull() throws Exception {
        Object operation = new MyOpFactory().getOpInstance(5);

        Assert.assertTrue("Ошибка операции", (operation == null));
    }
    }

