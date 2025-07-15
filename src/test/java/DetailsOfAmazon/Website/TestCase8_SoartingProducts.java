package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestCase8_SoartingProducts extends CommonClass{
	@Test(retryAnalyzer=RetryLogic.class)
	public void Sortingwithfilters()
	{
		SearchPage laptop=new SearchPage(driver);
		laptop.Laptop(driver);
		
		SortingPage sortpage=new SortingPage(driver);
		sortpage.DropDown(driver);
		sortpage.Price(driver);
		sortpage.DropDown1(driver);
		sortpage.Review(driver);
		sortpage.DropDown2(driver);
		sortpage.VerifyByText(driver);
		
	}

}
