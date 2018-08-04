package datafile;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcelFile 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//Locate the File path
		XSSFWorkbook wbook=new XSSFWorkbook("./Data/login1.xlsx");
		//Goto the Sheet
		XSSFSheet sheet = wbook.getSheet("login");
		//Find the Row Count
		int rowCount = sheet.getLastRowNum();
		//Find the Cell count
		short columnCount = sheet.getRow(0).getLastCellNum();
		//Read the Data
		for(int i=1; i<=rowCount;i++) 
		{
			XSSFRow row = sheet.getRow(i);
			System.out.println("Data from Excel File: ");
			for (int j=0; j<columnCount; j++) 
			{
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		wbook.close();
	}

}
