package test_package;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassTestNG {

    @Test
    public void testNGTest() {
        System.out.println("TestNG test");
        Assert.assertEquals(1,1);
    }

    @Test
    public void testNGTestNegative() {
        System.out.println("TestNG test");
        Assert.assertEquals(1,2);
    }


}
