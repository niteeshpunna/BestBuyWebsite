package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.baseClass;
import PageObjects.BestBuyBrands;
import PageObjects.HomePage;
import PageObjects.MyAccountPage;

public class TC_07_AddCartShopBrand extends baseClass {
	
	@Test
	public void testAddCartShopBrand() {
	
	try 
	{
		HomePage hp = new HomePage(driver);
		hp.clickMenu();
		Thread.sleep(1000);
		hp.clickBrands();
		Thread.sleep(1000);
		hp.clickBestBuyBrands();
		Thread.sleep(2000);
		
		BestBuyBrands bbb = new BestBuyBrands(driver);
		bbb.clickBestBuyBrandsAppliances();
		bbb.clickBestBuyBrandsAC();
		Thread.sleep(2000);
		bbb.clickBBBFirstItem();
		Thread.sleep(1000);
		bbb.clickBBBAddtoCart();
		Thread.sleep(3000);
		bbb.clickContinueShopping();
		
		MyAccountPage map = new MyAccountPage(driver);
		map.clickCart();
		Thread.sleep(2000);
		map.verifyCheckout();
		
	}
	catch(Exception e) 
	{
		e.printStackTrace();
		Assert.fail();
	}
	}
}


