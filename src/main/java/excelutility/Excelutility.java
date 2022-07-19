package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{
	public static String getdata( int rowno, int coloum)
	  {   String value="";
		  String path="C:\\Users\\Priya\\eclipse-workspace\\webdriverProject\\src\\test\\resources\\driver\\Data Read.xlsx";
		  try 
		  {
			  FileInputStream fis=new FileInputStream(path);
			  XSSFWorkbook wb=new XSSFWorkbook(fis);
			  XSSFSheet sheet=wb.getSheet("Sheet1");
			 value=sheet.getRow(rowno).getCell(coloum).getStringCellValue();	
		}
		  catch (Exception e) 
		  {
			System.out.println("Issue in getdata" +e);
		   }
		  return value;		  			
}

public static String excelreaddata(int rowno, int coloum)
{
	 String value="";
	  String path="C:\\Users\\Priya\\eclipse-workspace\\webdriverProject\\src\\test\\resources\\driver\\Data Read.xlsx";
	  try 
	  {
		  FileInputStream fis=new FileInputStream(path);
		  XSSFWorkbook wb=new XSSFWorkbook(fis);
		  XSSFSheet sheet=wb.getSheet("Sheet2");
		 value=sheet.getRow(rowno).getCell(coloum).getStringCellValue();
		
	}
	  catch (Exception e) 
	  {
		System.out.println("Issue in getdata" +e);
	   }
	  return value;		
}
	
	
	
}
