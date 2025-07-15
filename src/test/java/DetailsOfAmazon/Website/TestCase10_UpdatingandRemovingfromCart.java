package DetailsOfAmazon.Website;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestCase10_UpdatingandRemovingfromCart extends CommonClass{
	@Test(retryAnalyzer=RetryLogic.class)
	public void UpdatingCart()
	{
		SearchPage searchpage=new SearchPage(driver);
		searchpage.Mobile(driver);
		
		AddingtoCartPage addtocart=new AddingtoCartPage(driver);
		addtocart.Mobile(driver);
		addtocart.AddtoCart(driver);
		addtocart.VerifybyText(driver);
		searchpage.Shoes(driver);
		
	CartPage cartpage=new CartPage(driver);
	
		cartpage.Mobile2(driver);
		cartpage.AddtoCart1(driver);
		cartpage.GotoCart(driver);
		cartpage.RemoveCart(driver);
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");

	}
}
