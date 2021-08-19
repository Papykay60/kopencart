   package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
 WebDriver driver;
 
 public LoginPage(WebDriver driver)
 {
	this.driver=driver;
	
    PageFactory.initElements(driver, this);
 } 
    
    
    
    @FindBy(xpath="//input[@id='input-email']")
    WebElement txtEmailAddress;
    
    @FindBy(id="input-password")
    WebElement txtPassword;
    
    @FindBy(xpath="//input[@value='Login']")
    WebElement btnLogin;
    
    @FindBy(xpath="//h2[contains(text(),'My Account')]")
    WebElement  Msgconfirmation;
    
    
    public void setEmail(String email)
    {
    	txtEmailAddress.sendKeys(email);
    }
    
    public void setPassword(String pwd)
    {
    	txtPassword.sendKeys(pwd);
    }
 
    public void Clicklogin()
    {
    	btnLogin.click();
    }
	
	public boolean isMyAccountPageExists()
	{
	 try	
	 {
	 return(Msgconfirmation.isDisplayed());
	 }
	 catch(Exception e)	
	 {
	  return(false);
	 
	 }
		 
	
	
}
	
	
	
	
	
	
	
}
