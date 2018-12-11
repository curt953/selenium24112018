package dayFive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
		"D:\\Documents\\Software University\\QA\\Resources\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.edureka.co";
		Actions build = new Actions(driver);

		Login userOne = new Login();
		String loginButton = userOne.loginButton("/html/body/div[2]/header/section/nav/div/a[2]");
		String emailInput = userOne.emailInput("si_popup_email");
		String passInput = userOne.passInput("si_popup_passwd");
		String submitButton = userOne.submit("/html/body/div[2]/div[3]/div/div/div[2]/div[3]/form/button");
		String loginEmail = userOne.loginEmail("svilen.nikolov1@abv.bg");
		String loginPassWord = userOne.loginPassword("Zapomnime1!");

		NavigateToMyProfile navigate = new NavigateToMyProfile();
		String dropDown = navigate.dropDown("/html/body/div[2]/header/section/nav/div/ul[2]/li[1]/a");
		String span = navigate.span("/html/body/div[2]/header/section/nav/div/ul[2]/li[1]/ul/li[1]/a");

		UpdateProfessionalAndPersonalDetails update = new UpdateProfessionalAndPersonalDetails();
		String professionalDetailsButton = update.professionalDetailsButton("professional_details");
		String professionalDetailsCompanyName = update.professionalDetailsCompanyName("companyName");
		String professionalDetailsIndustryDropDown = update.professionalDetailsIndustryDropDown("currentIndustry");
		String professionalDetailsJobLevelDropDown = update.professionalDetailsJobLevelDropDown("currentjob");
		String professionalDetailsSkillsInput = update.professionalDetailsSkillsInput("userSkill");
		String professionalDetailsLinkedInProfileInput = update.professionalDetailsLinkedInProfileInput("linkedinLink");

		String personalDetailsButton = update.personalDetailsButton("Personal Details");
		String personalDetailsNameInput = update.personalDetailsNameInput("fullname");
		String personalDetailsTelephoneInput = update.personalDetailsTelephoneInput("phone_number");
		String personalDetailsCurrentRoleInput = update.personalDetailsCurrentRoleInput("currentrole");
		String personalDetailsExperienceDropDown = update.personalDetailsExperienceDropDown("experience");

		ExploreBlogAndNavigateToMainPage explore = new ExploreBlogAndNavigateToMainPage();
		String openDropDown = explore.openDropDown("/html/body/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[3]/div/button");
		String openBlog = explore.openBlog("Blog");

		LogoutOfPortal logout = new LogoutOfPortal();
		String openProfileDropDown = logout.openProfileDropDown("/html/body/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[8]/div/button");
		String openLogoutSpan = logout.openLogoutSpan("Log Out");

		driver.manage().timeouts().setScriptTimeout(77, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

		driver.findElement(By.xpath(loginButton)).click();
		driver.findElement(By.id(emailInput)).sendKeys(loginEmail);
		driver.findElement(By.id(passInput)).sendKeys(loginPassWord);
		driver.findElement(By.xpath(submitButton)).click();

		driver.findElement(By.xpath(dropDown)).click();
		driver.findElement(By.xpath(span)).click();

		driver.findElement(By.id(professionalDetailsButton)).click();
		driver.findElement(By.name(professionalDetailsCompanyName)).sendKeys("Lorem ipsum");
		driver.findElement(By.name(professionalDetailsSkillsInput)).sendKeys("Lorem ipsum");
		Select ddownOne = new Select(driver.findElement(By.name(professionalDetailsIndustryDropDown)));
		ddownOne.selectByVisibleText("Internet");
		Select ddownTwo = new Select(driver.findElement(By.name(professionalDetailsJobLevelDropDown)));
		ddownTwo.selectByVisibleText("Entry Level");
		driver.findElement(By.name(professionalDetailsLinkedInProfileInput)).sendKeys("Lorem ipsum");

		driver.findElement(By.linkText(personalDetailsButton)).click();
		driver.findElement(By.name(personalDetailsNameInput)).sendKeys("Lorem ipsum");
		driver.findElement(By.name(personalDetailsTelephoneInput)).sendKeys("7777777");
		driver.findElement(By.name(personalDetailsCurrentRoleInput)).sendKeys("Lorem ipsum");
		Select ddownThree = new Select(driver.findElement(By.id(personalDetailsExperienceDropDown)));
		ddownThree.selectByVisibleText("2-4 years");

		driver.navigate().back();
		driver.navigate().back();

		driver.findElement(By.xpath(openDropDown)).click();
		driver.findElement(By.linkText(openBlog)).click();

		driver.navigate().back();

		driver.findElement(By.xpath(openProfileDropDown)).click();
		driver.findElement(By.linkText(openLogoutSpan)).click();

	}

}