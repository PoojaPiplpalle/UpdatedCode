import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MapWithDataProvider {

	
	  @Test(dataProvider = "data")
	  public void integrationTest(Map<Object, Object> data) {
	    String username=(String) data.get("UserName");
	    System.out.println(username);
	   // System.out.println(map.get("Password"));
	   // System.out.println(map.get("DoB"));

	  

	  }

	  @DataProvider(name = "data")
	  public Object[][] dataSupplier() throws IOException {

	    File file = new File("C:\\Users\\lenovo\\Documents\\ToolsQA\\HashMapwithdataprovide.xlsx");
	    FileInputStream fis = new FileInputStream(file);

	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet = wb.getSheetAt(0);
	    
	    int lastRowNum = sheet.getLastRowNum() ;
	    int lastCellNum = sheet.getRow(0).getLastCellNum();
	    Object[][] obj = new Object[lastRowNum][1];

	    for (int i = 0; i < lastRowNum; i++) {
	      Map<Object, Object> datamap = new HashMap();
	    	
	      for (int j = 0; j < lastCellNum; j++) {
	        datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
	      }
	      obj[i][0] = datamap;

	    }
	    return  obj;
	  }

	}