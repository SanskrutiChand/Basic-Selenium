package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_usingXpath_by_Attribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
		
		WebElement cn=driver.findElement(By.xpath("//input[@id='cardNumber']"));
		cn.sendKeys("4564-6767-2345-2335");
		Thread.sleep(1000);
		WebElement ed=driver.findElement(By.xpath("//input[@id='expiryDate']"));
		ed.sendKeys("12/28");
		Thread.sleep(1000);
		WebElement cv=driver.findElement(By.xpath("//input[@id='cvv']"));
		cv.sendKeys("675");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.id("cardType"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Mastercard");
		Thread.sleep(1000);
		WebElement amount=driver.findElement(By.xpath("//input[@id='amount']"));
		amount.sendKeys("20000");
		WebElement sc=driver.findElement(By.xpath("//input[@id='saveCard']"));
		sc.click();
		WebElement mp=driver.findElement(By.xpath("//input[@value='Make Payment']"));
		mp.click();
	}

}
