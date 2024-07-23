package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_Xpath_AmazonSignIn {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement mail=driver.findElement(By.xpath("(//input)[7]"));
		mail.sendKeys("chandsanskruti@gmail.com");
		WebElement con=driver.findElement(By.xpath("(//input)[10]"));
		con.click();
		WebElement password=driver.findElement(By.xpath("(//input)[9]"));
		password.sendKeys("Wfguy@567");
		WebElement Sign_in=driver.findElement(By.xpath("(//input)[10]"));
		Sign_in.click();
	}

}
