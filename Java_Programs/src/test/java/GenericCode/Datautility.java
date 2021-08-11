package GenericCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datautility
{
  

public String getDataFromproperty(String key)throws IOException
   {
	   FileInputStream fis = new FileInputStream("..//Java_Programs/src/main/resources/Data_Access/data.properties.txt");
	   
	   Properties poj = new  Properties();
	   poj.load(fis);
	   
	   return poj.getProperty(key);
   }
   
   public String getDataFromExcel(String sheetname,int row,int cell)throws IOException
   {
	   FileInputStream fis = new FileInputStream("..//Java_Programs/src/main/resources/Data_Access/Book1.xlsx");
	   org.apache.poi.ss.usermodel.Workbook book = WorkbookFactory.create(fis);
	   DataFormatter  format = new DataFormatter();
	   return format.formatCellValue(book.getSheet(sheetname).getRow(row).getCell(cell));
   }
}
