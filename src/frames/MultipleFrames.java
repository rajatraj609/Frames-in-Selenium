package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleFrames {
	@Test
	public void FramesDemo() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\DXC Selenium Automation\\Locator in Selenium(Name-Chrome)\\SeleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RAJAT%20RAJ/Downloads/frame.html");
		
		Thread.sleep(20000);
		//Count Number of Frames
		int totalnoFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames...." + totalnoFrames);
		//Perform some action in Selenium Website
		//Switch to statement
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		Thread.sleep(20000);
		driver.findElement(By.id("log_email")).sendKeys("rajatraj609@gmail.com");
		driver.findElement(By.id("log_password")).sendKeys("Rajat123");
		driver.findElement(By.xpath("//*[@id=\"log_frm\"]/div[4]/input[1]")).click();
		
		driver.navigate().to("file:///C:/Users/RAJAT%20RAJ/Downloads/frame.html");
		
		Thread.sleep(20000);
		
	}

}
