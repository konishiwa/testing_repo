package automation.base;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;

public class TestBase {
	
	WebDriver driver;

	@BeforeClass
	public static void init(){
		RestAssured.baseURI = "http://localhost:8080/student";
//		initializeDriver();
	}
	
    public WebDriver initializeDriver()
    {
//    	Properties properties = new Properties();
    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium WebDrivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	return driver;
    }
}
