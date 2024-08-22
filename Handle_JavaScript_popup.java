package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_JavaScript_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//button[.='Click ']"));
		e1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();     //UnhandledAlertException- accept the java script pop up
		//e1.click();

	}

}
