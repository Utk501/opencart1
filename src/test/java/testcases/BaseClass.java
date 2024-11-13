package testcases;

import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {

public WebDriver driver;
public Logger logger;
public Properties p;


@BeforeClass
@Parameters({"os","browser"})
public void setup(String os,String br) throws IOException {
	
	FileReader file=new FileReader(".src//test//resources//conig.properties");
	p=new Properties();
	p.load(file);
	//logger=LogManager.getlo
	switch(br.toLowerCase()) {
	case "chrome":driver=new ChromeDriver();break;
	case "edge":driver=new EdgeDriver();break;
	case "firefox": driver=new FirefoxDriver();break;
	default: System.out.println("invalid browser"); return;
	}


driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get(p.getProperty("appurl"));
driver.manage().window().maximize();

}
@AfterClass
void tearDown() {
driver.quit();
}

}
