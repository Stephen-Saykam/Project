package DDT.practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.genericLib.IPathConstant;

/**
 * 
 * @author stephen
 *
 */
public class ReadDataFromExcelThroughDataProvider {
	
	@DataProvider
	public Object[][] readDataFromExcelThroughDataProvider() throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet3");
		int lr = sh.getLastRowNum();
		int lc = sh.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[lr][lc];
		for(int i=0; i<lr; i++)
		{
			for(int j=0; j<lc; j++)
			{
				data[i][j]=sh.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	@Test(dataProvider="readDataFromExcelThroughDataProvider")
	
	public void ExcelThroughDataProvider(String name)
	{
		System.out.println(name);
	}

}



