package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath_MKT_file {

		public static void main(String[] args) throws InterruptedException
		{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Sanskruti.Chand");
		Thread.sleep(1000);
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("Culture");
		Thread.sleep(1000);
		WebElement password=driver.findElement(By.xpath("(/html/body/input)[3]"));
		password.sendKeys("Sansu@123");
		Thread.sleep(1000);
		WebElement Fname=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		Fname.sendKeys("Sanskruti");
		Thread.sleep(1000);


		WebElement boy=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		boy.click();
		Thread.sleep(1000);
		WebElement girl=driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		girl.click();
		Thread.sleep(1000);
		WebElement baby=driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		baby.click();
		Thread.sleep(1000);

		WebElement Male=driver.findElement(By.xpath("(/html/body/input)[4]"));
		Male.click();
		Thread.sleep(1000);
		WebElement Female=driver.findElement(By.xpath("(/html/body/input)[5]"));
		Female.click();
		Thread.sleep(1000);
		WebElement C=driver.findElement(By.xpath("(/html/body/input)[6]"));
		C.click();




		
	}

}
