package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
WebDriver driver;

public HomePage(WebDriver driver)
{

	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement txtMyAccount;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement txtRegister;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement bottnlogin;


public void ClickMyaccount()
{
	txtMyAccount.click();
}

	
public void txtRegister()
{
	txtRegister.click();
}
	
public void Clicklogin()
{
	bottnlogin.click();
}



	
}
	
	
	
	
	
	

