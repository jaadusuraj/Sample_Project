package org.para.testcases;

import org.para.base.TestBase;
import org.para.pages.HomePage;
import org.para.pages.SignUpPage;
import org.para.util.TestUtil;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpPageTest extends TestBase {

    HomePage homePage;
    SignUpPage signUpPage;

    String sheetName = prop.getProperty("sheetname");

    public SignUpPageTest()
    {
        super();
    }

    @BeforeSuite
    public void startingConfiguration()
    {
        initializeBrowser();
        homePage = new HomePage();
        signUpPage = new SignUpPage();
    }

    @Test(priority = 1)
    public void clickingOnRegistrationButton()
    {
        homePage.clickOnRegisterLink();
    }

    @DataProvider
    public Object[][] getRegisterTestData()
    {
        Object data[][] = TestUtil.getTestData("Register");
        return data;
    }

    @Test(priority = 1, dataProvider = "getRegisterTestData")
    public void signingUp(String first_name, String last_name, String address, String city, String state, String zipCode, String ssn, String user_name, String password, String confirmPassword) throws IOException {
        signUpPage.signUp(first_name, last_name, address, city, state, zipCode, ssn, user_name, password,confirmPassword);
        TestUtil.takeScreenshotAtEndOfTest();
    }

    @AfterSuite
    public void closingDown()
    {
        driver.quit();
    }

    //@BeforeSuite
    //@BeforeTest
    //@BeforeClass
    //@BeforeMethod
    //@Test
    //@AfterMethod
    //BeforeMethod
    //@Test
    //@AfterMethod
    //@AfterClass
    //@AfterTest
    //@AfterSuite

}
