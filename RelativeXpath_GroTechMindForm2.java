package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_GroTechMindForm2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement Fname=driver.findElement(By.xpath("//input[@id='fname']"));
		Fname.sendKeys("Twinkle");
		WebElement Lname=driver.findElement(By.xpath("//input[@id='lname']"));
		Lname.sendKeys("Singh");
		WebElement mail_id=driver.findElement(By.xpath("//input[@id='email']"));
		mail_id.sendKeys("twinkle.singh@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("rtyu@1234");
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		male.click();
		WebElement female=driver.findElement(By.xpath("//input[@id='Female']"));
		female.click();
		WebElement present_add=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		present_add.sendKeys("A-231,Sector-122,Noida");
		WebElement permanent_add=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		permanent_add.sendKeys("A-231,Sector-122,Noida");
		WebElement pincode=driver.findElement(By.xpath("//input[@id='Pincode']"));
		pincode.sendKeys("201307");
		WebElement r=driver.findElement(By.xpath("//input[@id='relocate']"));
		r.click();
	}

}
