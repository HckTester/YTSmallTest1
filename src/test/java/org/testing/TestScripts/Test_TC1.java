package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.Home_Page;
import org.testing.Pages.Login_Page;
import org.testing.Pages.Logout_Page;
import org.testing.assertion.Assertt;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Report;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class Test_TC1 extends Base {
	
	

	@BeforeMethod
	public void TestCase_TC1_Login() throws Exception {
		Login_Page login = new Login_Page(driver, pr); // add here driver and pr
		login.sign_in("username", "password");
		Thread.sleep(7000);
		
	}

	@Test(priority = 1)
	public void Trending_Click() throws Exception {
		Home_Page Home = new Home_Page(driver, pr);
		Home.Click_Trending_section();
		

	}

	@AfterMethod
	public void TestCase_TC1_Logout() throws Exception {
		Logout_Page logout = new Logout_Page(driver, pr);
		logout.logout_successfully();
		

	}


}
