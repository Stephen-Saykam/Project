package seleniumGridPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteExecution {
	
	@Test
	public void remoteExecution() throws MalformedURLException 
	{
		URL url = new URL("http://192.168.186.1:4444/wd/hub/");
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		dc.setCapability("browser", "chrome");
		dc.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://www.flipkart.com/");
	}

}
