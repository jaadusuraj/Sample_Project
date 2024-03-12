package org.para.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.para.base.TestBase;
import org.para.pages.LoginPage;
import org.para.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

import java.io.IOException;
//import java.util.logging.Logger;


public class LoginTest extends TestBase {

    //debug
    //info
    //error

    LoginPage loginPage;
    Logger log = LogManager.getLogger(LoginTest.class);

    public LoginTest()
    {
        super();
    }

    @BeforeClass
    public void setUp()
    {
        initializeBrowser();
        loginPage = new LoginPage();
        log.info("Initializing browser");
    }

    @Test(priority = 1)
    public void validateLoginPageTitle()
    {
        String title = loginPage.verifyLoginPageTitle();
        Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
        log.info("Verifying Page Title");
    }

    @Test(priority = 2)
    public void loginToApplication() throws IOException {
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        //log.debug("Login into application");
        TestUtil.takeScreenshotAtEndOfTest();
        Assert.assertEquals(1,1);
        log.info("Login into para soft bank application");
    }

    @Test(priority = 3)
    public void thirdTest()
    {
        System.out.println("Third Test Case");
        Assert.assertFalse(1==1,"Not Correct");
        log.debug("Debugging third case");
    }

    @Test(priority = 4)
    public void fourthTest()
    {
        System.out.println("Fourth Test Case");
        Assert.assertEquals(11,12);
    }

    @AfterClass()
    public void tearDown()
    {
        driver.quit();
        log.debug("Closing the window");
    }

//          <dependency>
//            <groupId>org.apache.logging.log4j</groupId>
//            <artifactId>log4j-core</artifactId>
//            <version>2.23.0</version>
//        </dependency>
}
