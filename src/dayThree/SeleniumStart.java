package dayThree;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStart {
	
	ChromeDriver driver;
	
	public void OpenBrowser() {
		
		System.setProperty("chrome.webdriver.driver", 
		"D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		String webAddress = "https://www.facebook.com";
		
		driver.manage().window().maximize();
		driver.get(webAddress);
		driver.manage().deleteAllCookies();
		
	}
	
	public void CloseBrowser() {
		
		driver.quit();
		
	}
	
}