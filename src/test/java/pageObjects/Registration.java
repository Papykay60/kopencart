package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration
{
  public WebDriver driver;


public Registration(WebDriver driver)
{
 this.driver=driver;
 PageFactory.initElements(driver, this);
}



@FindBy(css="#input-firstname")
WebElement txtfirstName;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastName;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtemail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtCnfmPassword;

@FindBy(xpath="//input[@value='Continue']")
WebElement btnContinue;

@FindBy(xpath="//input[@name='agree']")
WebElement txtPrivacyPolicy;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")

WebElement MsgWordconfirmation;



public void setFirstName(String fname)
{
	txtfirstName.sendKeys(fname);
}

public void setLastName(String Lname)
{
	txtLastName.sendKeys(Lname);
}

public void setemail(String email)
{
	 txtemail.sendKeys(email);
}

public void setTelephone(String Tphone)
{
	txtTelephone.sendKeys(Tphone);
}

public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}

public void setconfirmPassword(String cnfpwd)
{
	txtCnfmPassword.sendKeys(cnfpwd);
}

public void setcontinue()
{
	btnContinue.click();
}

public void setPrivacypolicy()
{
	txtPrivacyPolicy.click();
}

public String setMsgwordHeading()
{
try
{
return(MsgWordconfirmation.getText());
}
catch(Exception e)
{
return(e.getMessage());
}
}







}
