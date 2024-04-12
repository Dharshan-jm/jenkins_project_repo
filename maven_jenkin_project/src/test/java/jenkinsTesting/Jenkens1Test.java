package jenkinsTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jenkens1Test {
 
	
	@Test
	public void browserlaunch() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("browser launch success", true);
	}
}
