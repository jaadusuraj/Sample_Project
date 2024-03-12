import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AutoITConcept {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\css123557\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='nDcEnd']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='DV7the']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\css123557\\Desktop\\autoitpractice.exe");
    // request merge
        //make
        // git pull
        // git add NewFeature.class
        // git commit -m "NewFeature.class file is added for new feature"
        // git push
        // request merge
    }
}
