package basics.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		//launching the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com");
		
		//Minimizing, maximizing and closing the tab
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(20000);
		//driver.close();
		//driver.quit();
		
		//to get ID of the browser or tab
		System.out.println(driver.getWindowHandles());
	}

}
