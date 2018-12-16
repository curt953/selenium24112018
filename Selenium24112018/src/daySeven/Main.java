package daySeven;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.gecko.driver",
            "D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\geckodriver\\geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();

            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.amazon.co.uk");
        }
        catch (Exception e) {
            System.out.println("Exception occurred: ");
            e.printStackTrace();
        }
    }

}