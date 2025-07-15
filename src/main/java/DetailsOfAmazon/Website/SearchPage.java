package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class SearchPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert assertdetails=new SoftAssert();
@FindBy(id="twotabsearchtextbox")
WebElement searchbox;

@FindBy(xpath="//a[@id=\"nav-orders\"]")
WebElement verifying;

public void Laptop(WebDriver driver)
{
	assertdetails.assertEquals(searchbox.isDisplayed(), true);
	wait.until(ExpectedConditions.visibilityOf(searchbox));
	searchbox.sendKeys("laptop"+Keys.ENTER);
}

public void Mobile(WebDriver driver)
{
	assertdetails.assertEquals(searchbox.isDisplayed(), true);
	wait.until(ExpectedConditions.visibilityOf(searchbox));
	searchbox.sendKeys("mobiles"+Keys.ENTER);
}

public void Shoes(WebDriver driver)
{
	assertdetails.assertEquals(searchbox.isDisplayed(), true);
	wait.until(ExpectedConditions.visibilityOf(searchbox));
	searchbox.sendKeys("shoe"+Keys.ENTER);
}
public void Verifying(WebDriver driver)
{
	assertdetails.assertEquals(verifying.isDisplayed(), true);
}
public SearchPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



}
