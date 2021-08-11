package GenericCode;

import java.io.FileInputStream;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet 
{
   public static void main(String[] args) throws Exception, EncryptedDocumentException
   {
	   FileInputStream fis = new FileInputStream("./TestData.xlsx");
	  
	   Workbook book = WorkbookFactory.create(fis);
	 
	   Sheet sh = book.getSheet("Sheet1");
	   Row r = sh.getRow(1);
	   Cell c = r.getCell(1);
	   String Value = c.getStringCellValue();
	   System.out.println(Value);
   }
}
