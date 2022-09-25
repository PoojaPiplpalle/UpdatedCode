import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {
	//	steps:
	//Identify the testcases column by scanning the entire row.
	//once the column is identified then scan the entire testcase coloumn to identify the purchase testcase row
	//after u grab the purchase testcase row =pull all the data of the row and feed into test

	public ArrayList<String> getData(String testcasename) throws IOException {
		
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Documents\\ToolsQA\\DataDrivenFilebyUdemy.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		//System.out.println(sheets);
		
		for(int i=0;i<sheets;i++) {
			
			//System.out.println(workbook.getSheetName(i));
		if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
			
			
		XSSFSheet sheet=workbook.getSheetAt(i);
		//Identify the testcases column by scanning the entire row.
		Iterator<Row> rows=sheet.iterator();//it will each and every row.
		Row firstrow=rows.next();//control will got to first row i.t testcase//Row is return type of rows.next();
		//rows.next();//control will go to next row i.e Login
		Iterator<Cell> ce=firstrow.cellIterator();//will iterator all cell of 1st row that is testcase.

	int column=0;
	int k=0;//k is incrementing till it gets the testcase column then once it get it will enter inside if loop then k value is assined to column.if  k is 1 and it gets value testcase then column willbe 1
		while(ce.hasNext())//hasnext is used just to check if next cell is present or nor if present it return true otherwise false.
		{
			
			Cell value=ce.next();
			if(value.getStringCellValue().equalsIgnoreCase("testcase"))
				//will take stringvalue present in the cell.
			{
				 
				
				column=k;
			}
			k++;
		}
		//System.out.println(column);
		//once the column is identified then scan the entire testcase coloumn to identify the purchase testcase row
		
		
	while(rows.hasNext()) {
		
		Row r=rows.next();
		if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
			
			//after u grab the purchase testcase row =pull all the data of the row and feed into test
		Iterator<Cell> cv=	r.cellIterator();
		while(cv.hasNext()) {
			Cell c=cv.next();
			if(c.getCellType()==Cell.CELL_TYPE_STRING) {
				a.add(c.getStringCellValue());	
				}
			else {
				a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
				//(a.addAll(c.getNumericCellValue());//this error is coming becox we have declared list whc takes only 
				 //string bt we are adding interger so we need to convert the intrger to string and then add.//this error is coming becox we have declared list whc takes only string bt we are adding interger so we need to convert the intrger to string and then add.
	
			
			
			}
			}
			
		}
		}
		
	
		}
			
		}
		
		return a;
		
	}
	
	
	
	
	//this is scanning all sheets present in the excel then it matches with sheet name then store it in sheet variable of XSSFSheet type will excess the entire sheet. 
	//create arraylist:
	
	

}
