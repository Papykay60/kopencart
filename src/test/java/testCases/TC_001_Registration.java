package testCases;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Registration;
import testBases.BaseClass;

public class TC_001_Registration extends BaseClass
{


	@Test(groups={"regresssion","master"})
	public void  TC_001_Account_Registration() throws IOException
	{
		try
		{
		logger.info( "Test stared");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		logger.info("Opening thehomepage");
		
		HomePage pg = new HomePage(driver);
		pg.ClickMyaccount();
		pg.txtRegister();
		logger.info("Click on Register");
		Registration Reg = new Registration(driver);
		Reg.setFirstName("Julius");
		logger.info("FirstName entered");
		Reg.setLastName("Oladele");
		logger.info("Surname entered");
		Reg.setemail(randomestring()+"@outlook.com");
		logger.info("email entered");
		Reg.setPassword("Mamao");
		Reg.setconfirmPassword("Mamao");
		logger.info(" password  entered");
		Reg.setTelephone("07828566800");
		logger.info("Telephone number entered");
		Reg.setPrivacypolicy();
		logger.info("Privacy policy clicked");
		Reg.setcontinue();
		logger.info("Continue button clicked");
		
		String confmsg=Reg.setMsgwordHeading();
		
		logger.info("Homepage confirmed");
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Account Registration successful");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Account Registration Failed");
			captureScreen(driver,"test_account_Registration");
		    Assert.assertTrue(false);
		}
	    
		}
		catch(Exception e)
		{
			logger.error("Account Registration Failed");
			Assert.fail();
		}
	
		logger.info("Finished TC_001_AccountRegistration");
		
	
     }
}
	
        
	
	
	
	
	
	

