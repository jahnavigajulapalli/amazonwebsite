package DetailsOfAmazon.Website;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerLogic.class)
public class TestCase4_EditingProfile extends CommonClass {

	@Test(retryAnalyzer=RetryLogic.class)
	public void EditingProfile() throws IOException
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
		
		ProfilePage profilepage=new ProfilePage(driver);
		profilepage.HoverOverAccount(driver);
		profilepage.YourAccount(driver);
		profilepage.LoginandSecurity(driver);
		//profilepage.Password(driver);
		//profilepage.Sigin(driver);
		profilepage.Edit(driver);
		profilepage.Name(driver);
		profilepage.SaveChanges(driver);
		profilepage.VerifyUsingText(driver);
		
	}
}
