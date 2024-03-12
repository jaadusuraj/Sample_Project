import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultipleWindowHandleConcept {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\css123557\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

       String parentWindow = driver.getWindowHandle();
//        driver.findElement(By.xpath("//a/button[@class=\"btn btn-info\"]")).click();
//        Thread.sleep(4000);
//        String childWindow = driver.getWindowHandle();
//        driver.switchTo().window(parentWindow);
//        Thread.sleep(2000);

//        driver.findElement(By.xpath("//a[contains(text(),\"Open New Seperate\")]")).click();
//        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
//        Thread.sleep(2000);
//        Set<String> windows = driver.getWindowHandles();
//        Iterator<String> iterator = windows.iterator();
//        while (iterator.hasNext())
//        {
//            String child_window = iterator.next();
//            if(!parentWindow.equals(child_window))
//            {
//                driver.switchTo().window(child_window);
//                System.out.println(driver.getTitle());
//                driver.close();
//            }
//        }
//        driver.switchTo().window(parentWindow);
        driver.findElement(By.xpath("//a[contains(text(),\"Open Seperate\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]")).click();
        Thread.sleep(2000);
        Set<String> multipleWindows = driver.getWindowHandles();
        Iterator<String> multiIterator = multipleWindows.iterator();
        while (multiIterator.hasNext())
        {
            String child_multiwindow = multiIterator.next();
            if(!parentWindow.equals(child_multiwindow))
            {
                driver.switchTo().window(child_multiwindow);
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
                if(driver.getTitle().equals("Selenium"))
                {
                    driver.findElement(By.xpath("//a[contains(text(),\"Read all about it\")]")).click();
                    Thread.sleep(2000);
                }
                Thread.sleep(2000);
                driver.close();
            }
        }

        driver.quit();
    }
}
