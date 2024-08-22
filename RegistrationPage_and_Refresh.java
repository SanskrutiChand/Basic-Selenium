package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage_and_Refresh 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement Fname=driver.findElement(By.xpath("//input[@id='fname']"));
		Fname.sendKeys("Twinkle");
		Thread.sleep(1000);
		WebElement Lname=driver.findElement(By.xpath("//input[@id='lname']"));
		Lname.sendKeys("Singh");
		Thread.sleep(1000);
		WebElement mail_id=driver.findElement(By.xpath("//input[@id='email']"));
		mail_id.sendKeys("twinkle.singh@gmail.com");
		Thread.sleep(1000);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("rtyu@1234");
		Thread.sleep(1000);
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		male.click();
		Thread.sleep(1000);
		WebElement female=driver.findElement(By.xpath("//input[@id='Female']"));
		female.click();
		Thread.sleep(1000);
		
		WebElement e1=driver.findElement(By.id("Skills"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Technical Skills");
		Thread.sleep(1000);
		WebElement country=driver.findElement(By.id("Country"));
		country.sendKeys("India");
		country.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement present_add=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		present_add.sendKeys("A-231,Sector-122,Noida");
		Thread.sleep(1000);
		WebElement permanent_add=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		permanent_add.sendKeys("A-231,Sector-122,Noida");
		Thread.sleep(1000);
		WebElement pincode=driver.findElement(By.xpath("//input[@id='Pincode']"));
		pincode.sendKeys("201307");
		Thread.sleep(1000);
		
		WebElement relegion=driver.findElement(By.id("Relegion"));
		relegion.sendKeys("Hindu");
		relegion.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement r=driver.findElement(By.xpath("//input[@id='relocate']"));
		r.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}

}
