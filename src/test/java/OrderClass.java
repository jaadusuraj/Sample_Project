import org.testng.annotations.*;

public class OrderClass {

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }

    @Test
    public void test()
    {
        System.out.println("Test");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }


    @Test
    public void test2()
    {
        System.out.println("Test 2");
    }


    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuit()
    {
        System.out.println("After suite");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }
}
