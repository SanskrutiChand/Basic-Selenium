package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CopyPaste_PresentAddress_to_PermanentAddress 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement p_add=driver.findElement(By.id("Present-Address"));
		p_add.sendKeys("Sector-142, Noida");
		p_add.sendKeys(Keys.CONTROL+"a");
		p_add.sendKeys(Keys.CONTROL+"c");
		WebElement pe_add=driver.findElement(By.id("Permanent-Address"));
		pe_add.sendKeys(Keys.CONTROL+"v");
	}

}
