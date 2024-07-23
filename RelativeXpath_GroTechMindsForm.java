package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RelativeXpath_GroTechMindsForm {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement Fname=driver.findElement(By.xpath("//input[@name='firstName']"));
		Fname.sendKeys("Sanskruti");
		Thread.sleep(1000);
		WebElement Lname=driver.findElement(By.xpath("//input[@name='lastName']"));
		Lname.sendKeys("Chand");
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("chandsanskruti@gmail.com");
		Thread.sleep(1000);
		WebElement phone_no=driver.findElement(By.xpath("//input[@id='phone']"));
		phone_no.sendKeys("8377802332");
		Thread.sleep(1000);
		//Select s1=new Select(gender);
		
		
		WebElement aadhar_no=driver.findElement(By.xpath("//input[@name='aadhaar']"));
		aadhar_no.sendKeys("576278290989");
		Thread.sleep(1000);
		WebElement pan=driver.findElement(By.xpath("//input[@name='pan']"));
		pan.sendKeys("BAJPC4350M");
		Thread.sleep(1000);
		WebElement terms=driver.findElement(By.xpath("//input[@name='terms']"));
		terms.click();
		
	}

	
	}


