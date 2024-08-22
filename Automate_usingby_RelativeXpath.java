package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_usingby_RelativeXpath 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		
		WebElement Fname=driver.findElement(By.xpath("(//input[@id='FirstName'])"));
		Fname.sendKeys("Sanskruti");
		WebElement Lname=driver.findElement(By.xpath("(//input[@id='LastName'])"));
		Lname.sendKeys("Rajwar");
		WebElement Mname=driver.findElement(By.xpath("(//input[@id='MiddleName'])"));
		Mname.sendKeys("Chand");
		WebElement wp_add=driver.findElement(By.xpath("(//textarea[@id='Work-Place-Address'])"));
		wp_add.sendKeys("Sector-63, Noida");
		WebElement h_add=driver.findElement(By.xpath("(//textarea[@id='home-address'])"));
		h_add.sendKeys("A/45, Noida");
		WebElement pe=driver.findElement(By.xpath("(//input[@id='Personal-Email'])"));
		pe.sendKeys("chandsanskruti@gmail.com");
		WebElement cm=driver.findElement(By.xpath("(//input[@id='Corporate-email'])"));
		cm.sendKeys("chandsanskrutiwork@gmail.com");
		WebElement mobile_no=driver.findElement(By.xpath("(//input[@id='tel'])"));
		mobile_no.sendKeys("8377802332");
		WebElement button=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])"));
		button.click();
				
	}

}
