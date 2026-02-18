package genericfileUtility;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtility {
	
	    public String getExcelData(String sheet, int row, int cell) throws Throwable {

	        FileInputStream fis = new FileInputStream("/Selenium_project/src/test/resources/Myproject TC.xlsx");
	        Workbook wb = WorkbookFactory.create(fis);
	        return wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	    }
	}

