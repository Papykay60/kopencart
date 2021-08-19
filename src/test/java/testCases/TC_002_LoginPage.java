package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBases.BaseClass;



public class TC_002_LoginPage extends BaseClass
{
	
 @Test (groups= {"sanity", "master"})
 public void test_Login()
 {
  try
  
  {
	logger.info("test started");
	driver.get(rb.getString("appURL"));
	logger.info("Home page displayed");
	driver.manage().window().maximize();
	
	HomePage pg =new HomePage(driver);
     pg.ClickMyaccount();
     logger.info("my account link clicked");
     pg.Clicklogin();
     logger.info("Login link clicked");
     LoginPage lg= new LoginPage(driver);
     lg.setEmail(rb.getString("email"));
     logger.info("email entered");
     lg.setPassword(rb.getString("password"));
     logger.info("password entered");
     lg.Clicklogin();
	 
	
     boolean desirePage=lg.isMyAccountPageExists();
     
     if(desirePage)
     {
    	logger.info("Login success"); 
    	 Assert.assertTrue(true);
     }
     else
     {	 
    	 logger.info("Login Success");
    	 
    	 Assert.assertTrue(false);
     }
     }
     catch(Exception e)
     {
    	 Assert.fail();
     }
     }
	   

     }

 
 
 


