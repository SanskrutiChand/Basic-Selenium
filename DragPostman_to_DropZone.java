package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragPostman_to_DropZone 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2'"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		
	}

}
