package org.para.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.para.base.TestBase;

public class LoginPage extends TestBase {

    public LoginPage()
    {

        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginButton;

    public String verifyLoginPageTitle()
    {
        return driver.getTitle();
    }

    public void login(String uName, String paswd)
    {
        userName.sendKeys(uName);
        password.sendKeys(paswd);
        loginButton.click();
    }


}
