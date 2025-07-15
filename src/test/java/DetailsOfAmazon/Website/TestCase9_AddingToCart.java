package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestCase9_AddingToCart extends CommonClass {
@Test(retryAnalyzer=RetryLogic.class)
public void AddingToCart()
{
	SearchPage mobilesearchpage=new SearchPage(driver);
	mobilesearchpage.Mobile(driver);
	
	AddingtoCartPage addtocart=new AddingtoCartPage(driver);
	addtocart.Mobile(driver);
	addtocart.AddtoCart(driver);
	addtocart.VerifybyText(driver);
	
}
}
