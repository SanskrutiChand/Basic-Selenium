package basics.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchAmazon_SearchShoes_ClickAnyShoesResult_MoveControlFromParentChildWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement shoe_45=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[45]"));
		shoe_45.click();
		
		//System.out.println(driver.getWindowHandle());  //only parent id
		
		Set<String> ids=driver.getWindowHandles();  //parentchild id
		Iterator<String> id=ids.iterator();
		String parentid=id.next();//parent id
		String childid=id.next();//1st child id
		Thread.sleep(3000);
		//driver.close();
		driver.switchTo().window(childid);  //move the control from parent to child
		driver.close();
	
	}

}