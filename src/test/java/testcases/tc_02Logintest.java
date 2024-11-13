package testcases;

import static org.testng.Assert.fail;

import java.lang.System.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.LoginPage;
import pageobject.MyaccountPage;
import pageobject.homepage;

public class tc_02Logintest extends BaseClass {
	@Test
	public void testcase2(){
	homepage hp=new homepage(driver);
	hp.clickmyaccount();
	hp.clickLogin();
	
	LoginPage lp=new LoginPage(driver);
	lp.setEmail(p.getProperty("email"));
	lp.setPassword(p.getProperty("password"));
	lp.clickLogin();
	
	MyaccountPage myacc=new MyaccountPage(driver);
	boolean targetpage=myacc.isMyaccountPageexist();
	Assert.assertEquals(targetpage, true,"login failed");
	//Assert.fail();
	}

}
