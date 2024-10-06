package org.para.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.para.base.TestBase;
import org.para.util.TestUtil;

public class HomePage extends TestBase {

    public HomePage()
    {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @FindBy(xpath = "//div[@id='headerPanel']/ul[1]/li[2]")
    WebElement aboutUsLink;

    public SignUpPage clickOnRegisterLink()
    {
        TestUtil.clickOnElement(registerLink);
        //registerLink.click();
        return new SignUpPage();
    }

    public void clickOnAboutUsLink()
    {
        TestUtil.clickOnElement(aboutUsLink);
    }
}