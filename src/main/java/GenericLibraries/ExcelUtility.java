package GenericLibraries;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility {
	
	/*This method is used to read data from excel*/
	public Object[][] ReadMultipleData(String sheetName) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int lastRow = sh.getLastRowNum()+1;
		int lastCell = sh.getRow(0).getLastCellNum();
		
		Object [][] obj = new Object [lastRow][lastCell];
		for(int i = 0;i<lastRow;i++)
		{
			for(int j = 0;j<lastCell;j++)
			{
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
	}
	
	public String readDataFromExcel(String SheetName, int RowNo, int ColumnNo) throws Throwable {
		/* create object for physical file */
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		/* create workbook */
		Workbook wb = WorkbookFactory.create(fi);
		/* get sheet */
		Sheet sh = wb.getSheet(SheetName);
		/* get row */
		Row ro = sh.getRow(RowNo);
		/* get cell */
		Cell cel = ro.getCell(ColumnNo);
		/* read the data */
		String value = cel.getStringCellValue();
		/* return the value */
		return value;
	}
}
