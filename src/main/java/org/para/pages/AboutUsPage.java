package org.para.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.para.base.TestBase;

public class AboutUsPage extends TestBase {

    public AboutUsPage()
    {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    WebElement heading;



    public String getHeader()
    {
        return heading.getText();
    }
}
