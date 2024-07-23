package basics.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchGoogle_ClickonGmailUsing_linktext_partiallinktextLocator 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	//	WebElement gmail_link=	driver.findElement(By.linkText("Gmail"));
		WebElement gmail_link=	driver.findElement(By.partialLinkText("Gma"));
		gmail_link.click();
	}

}
