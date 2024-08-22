package basics.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class WAP_DDTExceptions_How_ConvertNumericValue_StringValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\dell\\Automation\\SeleniumBasics\\DDT\\Sanskruti.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		String un= NumberToTextConverter.toText(w1.getSheet("login2").getRow(0).getCell(0).getNumericCellValue());
		System.out.println(un);
	}

}
