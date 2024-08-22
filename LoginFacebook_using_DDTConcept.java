package basics.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook_using_DDTConcept {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\dell\\Automation\\SeleniumBasics\\DDT\\Sanskruti.xlsx");
		
		Workbook w1= WorkbookFactory.create(f1);
		String un= w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String pwd= w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement mail=driver.findElement(By.xpath("//input[@id=\'email\']"));
		mail.sendKeys(un);
		WebElement password=driver.findElement(By.xpath("//input[@id=\'pass\']"));
		password.sendKeys(pwd);
		WebElement button=driver.findElement(By.xpath("//button[@name=\'login\']"));
		button.click();
	}

}
