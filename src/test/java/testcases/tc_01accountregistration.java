package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import freemarker.ext.beans.TemplateAccessible;
import net.bytebuddy.utility.RandomString;
import pageobject.accountregisration;
import pageobject.homepage;

public class tc_01accountregistration extends BaseClass{
	
	@Test
public void testcase(){
	homepage hp=new homepage(driver);
	hp.clickmyaccount();
	hp.clickRegister();
	
	accountregisration acc=new accountregisration(driver);
	acc.setFirstname("utkarsha");
	acc.setLastname("bhavsar");
	acc.setEmail("utkarsha.bhavsar11@gmail.com");
	acc.setTelephone("1234");
	acc.setPassword("123456");
	acc.setConfirmPassword("123456");
	acc.setPolicy();
	acc.clickContinue();
	//acc.login();
	
	String cnfirmmsg=acc.getconfirmationmsg();
	Assert.assertEquals(cnfirmmsg, "Your Account Has Been created");
}
	
}
