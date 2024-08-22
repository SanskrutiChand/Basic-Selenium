package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWhether_RadioButton_SelectedOrNot 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		
		WebElement c1=driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
		c1.click();
		boolean b1=c1.isSelected();
		System.out.println(b1);
		
		
	}

}
