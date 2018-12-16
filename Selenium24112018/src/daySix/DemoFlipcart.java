package daySix;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class DemoFlipcart {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
        "D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com");

        driver.findElement(By.xpath("//div[@class='_3Njdz7']//button[@class='_2AkmmA _29YdH8']")).click();
    }

}