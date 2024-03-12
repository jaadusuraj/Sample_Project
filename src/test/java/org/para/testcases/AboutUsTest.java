package org.para.testcases;

import org.para.base.TestBase;
import org.para.pages.AboutUsPage;
import org.para.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AboutUsTest extends TestBase {

    AboutUsPage aboutUsPage;

    public AboutUsTest()
    {
        super();
    }

    @BeforeClass
    public void setUp()
    {
        initializeBrowser();
        aboutUsPage = new AboutUsPage();
    }

    @Test
    public void verifyingHeader()
    {
        String header = aboutUsPage.getHeader();
        System.out.println(header);
    }

    @AfterClass()
    public void tearDown()
    {
        driver.quit();
        //log.debug("Closing the window");
    }
}
