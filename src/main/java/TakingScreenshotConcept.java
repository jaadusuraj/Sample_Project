import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.para.base.TestBase;
import org.para.util.TestUtil;

import java.io.File;
import java.io.IOException;

public class TakingScreenshotConcept extends TestBase {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\css123557\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

//        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("C:\\Users\\css123557\\Documents\\Flip\\Sample_Project\\src\\main\\first_screenshot.png"));

        TestUtil.takeScreenshotAtEndOfTest();

        driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();

        TestUtil.takeScreenshotAtEndOfTest();


    }
}
