package jenkinsTesting;

import org.testng.annotations.Test;

public class JenkinsParaTest {
@Test
public void test() {
	String browservar = System.getProperty("browser");
	System.out.println(browservar);
}
}
