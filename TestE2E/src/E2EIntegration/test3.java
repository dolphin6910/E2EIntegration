package E2EIntegration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3 {
	@Test
public void test01(){
	System.setProperty("webdriver.chrome.driver", "/Users/uanjum/Documents/TestSpace/TestE2E/Driver/chromedriver 2");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.iheart.com");
	driver.quit();
	
}
}

