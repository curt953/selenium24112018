package dayEight;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

public class POMDemoWithoutPageFactory {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
        "D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\geckodriver\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        String url = "http://automationpractice.com/index.php";
        String signInButton = "Sign in";
        String emailInputEl = "email";
        String emailInputVal = "edureka@edureka.co";
        String passwordInputEl = "passwd";
        String passwordInputVal = "edureka";
        String logInButton = "SubmitLogin";

        driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText(signInButton)).click();

        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id(emailInputEl)).sendKeys(emailInputVal);
        driver.findElement(By.id(passwordInputEl)).sendKeys(passwordInputVal);
        driver.findElement(By.id(logInButton)).click();
    }

}