package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountregisration extends BasePage {
WebDriver driver;
public accountregisration(WebDriver driver) {
	super(driver);
}
@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtConfirmPassword;

@FindBy(xpath="//input[@name='agree']")
WebElement chkPolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement btncontinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been created']")
WebElement msgConfirmation; 

//@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
//WebElement btnLogin;

public void setFirstname(String fname) {
	txtFirstname.sendKeys(fname);
	
}
public void setLastname(String lname) {
	txtLastname.sendKeys(lname);
}
public void setEmail(String mail) {
	txtEmail.sendKeys(mail);
	
}
public void setTelephone(String telenumber) {
	txtTelephone.sendKeys(telenumber);
	
}
public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void setConfirmPassword(String pwd) {
	txtConfirmPassword.sendKeys(pwd);
	
}
public void setPolicy() {
	chkPolicy.click();
}
public void clickContinue() {
	btncontinue.click();
}

//public void login() {
	//btnLogin.click();
//}
public String getconfirmationmsg() {
	try {
return(msgConfirmation.getText());
}catch(Exception e) {
	return(e.getMessage());
}
	
		
	
}
}