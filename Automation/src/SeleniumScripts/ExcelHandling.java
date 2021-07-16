package SeleniumScripts;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	public static String url;
	public static String username;
	public static String password;
	
	
public static void main(String[] args) throws Exception
	{
		  
		//ExcelHandling.excelReader();
		ExcelHandling.excelWrite();
	
	}

	public static void excelReader() throws IOException  
	{
	//path  filepath
	// Filename testdata.xlsx
	//sheet name  sheet1
	// column 1
	// row2
		   File f = new File("C:\\Users\\Praveen\\OneDrive\\Desktop\\Data.xlsx");
		   FileInputStream fis = new FileInputStream(f);
		   
           XSSFWorkbook workbook = new XSSFWorkbook(fis);
           XSSFSheet sheet = workbook.getSheet("Sheet1");
           
           
            url = sheet.getRow(1).getCell(0).getStringCellValue();
           
            username = sheet.getRow(1).getCell(1).getStringCellValue();
           password = sheet.getRow(1).getCell(2).getStringCellValue();

           
           System.out.println(url);
           
           System.out.println(username);
           
           System.out.println(password);
           
           workbook.close();
           
	}
     public static void excelWrite() throws Exception
      {

  		FileInputStream fis = new FileInputStream("C:\\Users\\Praveen\\OneDrive\\Desktop\\Data.xlsx");
             XSSFWorkbook workbook = new XSSFWorkbook(fis);
             XSSFSheet sheet = workbook.getSheet("Sheet1");
             
             Row row = sheet.createRow(2);
             Cell cell = row.createCell(1);
             
             cell.setCellValue("JHON");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\Praveen\\OneDrive\\Desktop\\Data.xlsx");
             workbook.write(fos);
             workbook.close();
}
}    

