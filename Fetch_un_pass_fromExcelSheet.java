package basics.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_un_pass_fromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\dell\\Automation\\SeleniumBasics\\DDT\\Sanskruti.xlsx");
		//step 1
		/*Workbook w1= WorkbookFactory.create(f1);
		Sheet s1= (Sheet) w1.getSheet("login");
		Row r1= w1.getRow(0);
		Cell c1=r1.getCell(0);
		String un= c1.getStringCellValue();
		System.out.println(un);
		
		Sheet s2= (Sheet) w1.getSheet("login");
		Row r2= w1.getRow(0);
		Cell c2=r1.getCell(1);
		String pwd= c1.getStringCellValue();
		System.out.println(pwd);*/
		
		
		Workbook w1= WorkbookFactory.create(f1);
		String un= w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String pwd= w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pwd);
	}

}
