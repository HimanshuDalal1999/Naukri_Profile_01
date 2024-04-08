package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
	public static String ExcelSheet(int RowIndex, int CellIndex) throws InvalidFormatException, IOException
	{
		String ExcelPath = System.getProperty("user.dir")+"\\Parameterization\\Naukri01.xlsx";
		FileInputStream ExcelFile = new FileInputStream(ExcelPath);
		String ExcelSheet = WorkbookFactory.create(ExcelFile).getSheet("Sheet1").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return ExcelSheet;
	}
	
	public static String PropertyFile(String Key) throws IOException
	{
		Properties Property = new Properties();
		String PropertyPath = System.getProperty("user.dir")+"\\Parameterization\\Naukri.properties";
		FileInputStream PropertyFile = new FileInputStream(PropertyPath);
		Property.load(PropertyFile);
		String PropertyKey = Property.getProperty(Key);
		return PropertyKey;
	}

}
