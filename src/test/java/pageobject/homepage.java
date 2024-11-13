package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends BasePage {

public homepage(WebDriver driver){
	super(driver);
}
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement linkmyaccount;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement linkregister;

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
WebElement linklogin;

public void clickmyaccount() {
	linkmyaccount.click();
}
public void clickRegister() {
	linkregister.click();
}
public void clickLogin() {
	linklogin.click();
}
}
