package com.fileutility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.TestYantra.VTiger.Login;
import com.TestYantra.VTiger.Logout;
import com.crm.VTiger.ObjectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver staticDriver;
	public DataBaseSelectQuery dataBase = new DataBaseSelectQuery();
	public ReadFromPropertyFile readFromProperty = new ReadFromPropertyFile();
	public Login logIn = new Login();
	public Logout logOut = new Logout();
	public WebDriverUtilities webUtility = new WebDriverUtilities();
	public JavaUtilities javaUtility = new JavaUtilities();
	
	LoginPage lp;
	
	//@Parameters("browser")
	@BeforeClass(groups= {"smoke","regression"})
	public void openBrowser() throws IOException {
		String browser = readFromProperty.propertyFile("browser");

		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else
			System.out.println("Invalid Browser");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		staticDriver = driver;
	}

	@BeforeMethod(groups= {"smoke","regression"})
	public void logIn() throws IOException {
	//WebDriverManager.chromedriver().setup();
		webUtility.implicitWait(driver, 30);
		String url = readFromProperty.propertyFile("url");
		driver.get(url);
		logIn.loginPage(driver);
	}

	@AfterMethod(groups= {"smoke","regression"})
	public void logOut() {
		LoginPage lp = new LoginPage(driver);
		webUtility.explicittWaitElementVisibilty(driver, 30, lp.followingLead);
		lp.signOut();
	}

	@AfterClass(groups= {"smoke","regression"})
	public void closeBrowser() {
		staticDriver.quit();
	}

	
}