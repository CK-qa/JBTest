package test_package;


import org.testng.Assert;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertNull;

public class TestClassTestNG {

    @Test
    public void testNGTest() {
        System.out.println("TestNG test");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testNGTestNegative() {
        System.out.println("TestNG test");
        Assert.assertEquals(1, 2);
    }


    @Test
    public void checkClassPathResource() {
        assertNull(getClass().getResource("test.properties"));
    }

    @Test
    public void checkSum() throws Exception {
        System.out.println(getSum(2, 2));
    }

    private int getSum(int i, int i1) throws Exception {
        try {
            return i + i1;
        } catch (ArithmeticException | NumberFormatException e) {
            throw new Exception("pew pew");
        }
    }


}
