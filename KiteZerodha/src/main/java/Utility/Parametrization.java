package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getData(int row, int cell) throws EncryptedDocumentException, IOException{
		FileInputStream file = new FileInputStream("D:\\Automation\\KiteZerodha\\src\\main\\resources\\LogiCredentialZerodha.xlsx");
		
		String user = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		
		return user;
	}

}
