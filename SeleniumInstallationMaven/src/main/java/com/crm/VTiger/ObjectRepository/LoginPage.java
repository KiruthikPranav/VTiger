package com.crm.VTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fileutility.BaseClass;
import com.fileutility.WebDriverUtilities;

public class LoginPage extends BaseClass {
	
		public WebDriver driver;
		
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Leads')])[1]")
	private WebElement leadClick;
	
	public void leadClick() {
		leadClick.click();
	}
	
	@FindBy(xpath="(//a[contains(text(),'Leads')])[2]/following::img[1]")
	private WebElement leadImageClick;
	
	public void leadImageClick() {
		leadImageClick.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Creating New Lead')]")
	private WebElement leadText;
	
	public String getLeadText() {
		return leadText.getText();
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	public WebElement followingLead;
	
	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement button;
	
	public  void signOut() {
		WebDriverUtilities wu = new WebDriverUtilities();
		wu.mouseHover(driver, followingLead);
		wu.doubleClick(driver, button);
		/*
		Actions act = new Actions(driver);
		act.moveToElement(followingLead).moveToElement(button).click().build().perform();
		*/
		//Logout logOut = new Logout();
		//logOut.logoutPage(driver, followingLead, button);
	}
	
	/**
	 * 
	 */
	@FindBy(xpath="(//a[@href='index.php?module=Accounts&action=index'])[1]")
	private WebElement clickOrg;
	
	public void clickOrg() {
		clickOrg.click();
	}
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement clickOrgImg;
	
	public void clickOrgImg() {
		clickOrgImg.click();
	}
	
	@FindBy(xpath="(//input[contains(@name,'accountname')])[1]")
	private WebElement name;
	
	public void name() {
		name.sendKeys("fsffsohvzsees1");
	}
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement addMember;
	
	public void addMember() {
		addMember.click();
	}
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement clickMember;
	
	public void clickMember() {
		clickMember.click();
	}
	
	@FindBy(name="button")
	private WebElement save;
	
	public void save() {
		save.click();
	}

}