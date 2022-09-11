package Tests.Day6_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class test_NG_Intro {
    @BeforeClass
    public void setUpClass(){
        System.out.println("---Before class is running....");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("----After class is running...");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("----Before method is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----After method is running");
    }

    @Test (priority =1)
    public void test1(){
        System.out.println("Running test 1....");
        String actual="apple";
        String expected="apples";
        Assert.assertEquals(actual,expected);
    }
    @Test (priority = 2)
    public void test2 (){
        System.out.println("Running test 2.....");
        System.out.println("Running test 1....");
        String actual="apple";
        String expected="apples";
        Assert.assertTrue(expected.equals(actual));
    }
}
