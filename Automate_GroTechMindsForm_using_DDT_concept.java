package basics.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Automate_GroTechMindsForm_using_DDT_concept {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();*/
		
        FileInputStream f1= new FileInputStream("C:\\Users\\dell\\Automation\\SeleniumBasics\\DDT\\Sanskruti.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		
		System.out.print("First name: ");
		String name= w1.getSheet("GroTechMindsForm").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
		System.out.print("Last name: ");
		String surname= w1.getSheet("GroTechMindsForm").getRow(1).getCell(0).getStringCellValue();
		System.out.println(surname);
		
		System.out.print("Email id: ");
		String mail= w1.getSheet("GroTechMindsForm").getRow(0).getCell(2).getStringCellValue();
		System.out.println(mail);
		
		System.out.print("Phone Number: ");
		String ph= NumberToTextConverter.toText(w1.getSheet("GroTechMindsForm").getRow(0).getCell(3).getNumericCellValue());
		System.out.println(ph);
		
		System.out.print("Gender: ");
		String f= w1.getSheet("GroTechMindsForm").getRow(0).getCell(4).getStringCellValue();
		System.out.println(f);
		
		System.out.println("State: ");
		String s= w1.getSheet("GroTechMindsForm").getRow(0).getCell(5).getStringCellValue();
		System.out.println(s);
		
		System.out.println("Aadhar Number: ");
		String ad= NumberToTextConverter.toText(w1.getSheet("GroTechMindsForm").getRow(0).getCell(6).getNumericCellValue());
		System.out.println(ad);
		
		System.out.println("Pan Number: ");
		String pn= NumberToTextConverter.toText(w1.getSheet("GroTechMindsForm").getRow(0).getCell(7).getNumericCellValue());
		System.out.println(pn);
		
		
		
	}

}
