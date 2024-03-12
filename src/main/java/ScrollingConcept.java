import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ScrollingConcept {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\css123557\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.navigate().to("https://google.com");
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
//        driver.findElement(By.id("APjFqb")).sendKeys("selenium");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//p/a[contains(text(),\"About Selenium\")]"));

        JavascriptExecutor exe = (JavascriptExecutor)driver;
        exe.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        WebElement newsElement = driver.findElement(By.xpath("//h2[contains(text(),\"News\")]"));
        exe.executeScript("arguments[0].scrollIntoView(true);", newsElement);
        //exe.executeScript("arguments[0].click();", element);



    }
}
