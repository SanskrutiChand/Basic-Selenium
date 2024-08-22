package basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAnything_pharmeasy_Select3rdOption {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//div[@class=\'c-PJLV c-bXbWpx c-bXbWpx-lfylVv-direction-row c-bXbWpx-fMErMJ-justify-left c-bXbWpx-joJbDg-align-center c-bXbWpx-ielOayq-css']"));
		search.click();
		Thread.sleep(2000);
		
		WebElement inbox=driver.findElement(By.id("topBarInput"));
		inbox.sendKeys("crocin");
		Thread.sleep(6000);
		
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-idIeDmn-css']/div/div"));
		int count =auto.size();
		auto.get(3).click();
		System.out.println(count);
	}

}
