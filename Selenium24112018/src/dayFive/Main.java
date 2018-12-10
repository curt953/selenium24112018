package dayFive;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	static String url;
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://www.edureka.co";
		
		driver.manage().timeouts().setScriptTimeout(77, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

}