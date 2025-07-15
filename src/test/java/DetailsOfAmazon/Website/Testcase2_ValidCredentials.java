package DetailsOfAmazon.Website;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerLogic.class)
public class Testcase2_ValidCredentials extends CommonClass {

	@Test(retryAnalyzer=RetryLogic.class)
	public void ValidCredentials() throws IOException
	{
		AmazonHome amazonhome=new AmazonHome(driver);
		amazonhome.HoverOverSigninOption(driver);
		amazonhome.SignIn(driver);
		amazonhome.Verify(driver);
		
		LoginPage loginpage=new LoginPage(driver);
		ExcelSheetPage excel=new ExcelSheetPage(driver);
		
		String un=excel.getusername(driver);
		String pwd=excel.getPwd(driver);
		
		loginpage.Un(un);
		loginpage.ContinueButton(driver);
		loginpage.Pwd(pwd);
		loginpage.SigninButton(driver);
		loginpage.VerifyingUsingText(driver);
	}
}
