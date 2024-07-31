package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import constants.Constants;

public class ExcelUtilities {
		static FileInputStream f;
	    static XSSFWorkbook w;
	    static XSSFSheet sh;

	    public static String getStringData(int a,int b,String sheet)throws IOException
		{
		String filepath=Constants.TestDataFile;//testdatafile is a static variable,so calling it using class name
		f=new FileInputStream(filepath);
		w=new XSSFWorkbook(f);//classes
		sh=w.getSheet(sheet);//classes
		Row r=sh.getRow(a);//interfaces
		Cell c=r.getCell(b);//interfaces
		return c.getStringCellValue();
		}

	    
public static String getIntegerData(int a,int b,String sheet)throws IOException
		{
		String filepath=Constants.TestDataFile;	
		f=new FileInputStream(filepath);
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheet);
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		int x=(int)c.getNumericCellValue();//double to integer type casting
		return String.valueOf(x);//integer to string
		}
}


