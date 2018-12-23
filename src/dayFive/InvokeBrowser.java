package dayFive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

    static WebDriver driver;

    static void browser(String webDriver) {

        switch (webDriver) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                "D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
            break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                "D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
                driver = new FirefoxDriver();
            break;

            case "edge":
                System.setProperty("webdriver.edge.driver",
                "D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\edgedriver\\MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
            break;
        }

    }

}