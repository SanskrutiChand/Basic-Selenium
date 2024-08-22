package basics.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Amazon_using_DDT_concept {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
FileInputStream f1= new FileInputStream("C:\\Users\\dell\\Automation\\SeleniumBasics\\DDT\\Sanskruti.xlsx");
		
		Workbook w1= WorkbookFactory.create(f1);
		String un= NumberToTextConverter.toText(w1.getSheet("login2").getRow(0).getCell(0).getNumericCellValue());
		System.out.println(un);
		String pwd= w1.getSheet("login2").getRow(0).getCell(1).getStringCellValue();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement mail=driver.findElement(By.xpath("//input[@id='ap_email_login']"));
		mail.sendKeys(un + Keys.ENTER);
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys(pwd + Keys.ENTER);
		WebElement captcha=driver.findElement(By.name("cvf_captcha_input"));
		captcha.sendKeys(Keys.ENTER);
	}

}
