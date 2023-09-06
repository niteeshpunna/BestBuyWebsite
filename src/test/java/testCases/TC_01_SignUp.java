package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.baseClass;
import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import Utilities.utilities;

public class TC_01_SignUp extends baseClass{
	
	@Test
	public void testSignUp() {
		
		try {
			
			HomePage hp = new HomePage(driver);
			hp.clickAccount();
			hp.clickCreateAccount();
			Thread.sleep(2000);
			
			CreateAccountPage mcap = new CreateAccountPage(driver);
			utilities util = new utilities();
			
			mcap.enterFirstName(util.randomString());
						
			mcap.enterLastName(util.randomString());
			
			mcap.enterEmail(util.randomString()+"@yopmail.com");
			
			mcap.enterPassword(rb.getString("password"));
			
			mcap.reEnterPassword(rb.getString("password"));
			
			mcap.enterPhone(util.randomeNumber());
			
			mcap.clickCreateAccountButton();
			
			
			
			
		}catch(Exception e) {
			Assert.fail();
		}
	}
	

}
