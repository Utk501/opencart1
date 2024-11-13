package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
public LoginPage(WebDriver driver) {
	super(driver);
}
@FindBy(xpath="//input[@id='input-email']")
WebElement txtemailaddress;


@FindBy(xpath="//input[@id=input-password']")
WebElement txtPassword;

@FindBy(xpath="//input[@value='Login']")
WebElement btnLogin;


public void setEmail(String mail) {
	txtemailaddress.sendKeys(mail);
	
}
public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void clickLogin() {
	btnLogin.click();
}

}
