package dayFive;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class DemoDraggable {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");

        WebElement from = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
        WebElement to = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[2]"));

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(from)
                                    .moveToElement(to)
                                    .release(to)
                                    .build();
        dragAndDrop.perform();
    }

}