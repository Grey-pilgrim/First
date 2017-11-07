package First.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyOpFactoryTest {

    private OperationFactory operationFactory;

    @Before
    public void setUp() throws Exception {
        operationFactory = new MyOpFactory();
    }

    @Test
    public void getOpInstancePlus() throws Exception {
        Operation operation = operationFactory.getOpInstance(1);

        assertTrue("Ошибка операции сложение", (operation instanceof OpPlus));
    }

    @Test
    public void getOpInstanceMin() throws Exception {
        Operation operation = operationFactory.getOpInstance(2);

        assertTrue("Ошибка операции вычитание", (operation instanceof OpMinus));
    }

    @Test
    public void getOpInstanceMultiply() throws Exception {
        Operation operation = operationFactory.getOpInstance(3);

        assertTrue("Ошибка операции умножение", (operation instanceof OpMultiply));
    }

    @Test
    public void getOpInstanceDivision() throws Exception {
        Operation operation = operationFactory.getOpInstance(4);

        assertTrue("Ошибка операции деление", (operation instanceof OpDivision));
    }

    @Test
    public void getOpInstanceNull() throws Exception {
        Operation operation = operationFactory.getOpInstance(12);

        assertTrue("Ошибка при получении неозвестной операции", (operation == null));
    }
    }

