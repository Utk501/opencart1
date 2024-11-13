package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends BasePage {
public MyaccountPage(WebDriver driver) {
	super(driver);
	
}
@FindBy(xpath="//h2[text()='My Account']")
WebElement msgHeading;

public boolean isMyaccountPageexist() {
	try {
	return msgHeading.isDisplayed();
	}catch(Exception e) {
		return false;
	}
}
}
