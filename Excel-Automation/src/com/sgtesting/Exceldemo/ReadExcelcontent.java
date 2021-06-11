package com.sgtesting.Exceldemo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;//all these must be imported from ss.usermodel only
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelcontent {

	public static void main(String[] args) {
		readContent();

	}
	static void readContent()
	{
		FileInputStream fin=null;//initialised as null to allow the object reach the finally block
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\Test.xlsx");//reads file in byte stream =a fundamental stream class
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("sheet1");//creates sheet object
			int rc=sh.getPhysicalNumberOfRows();//to get number of rows that contains data
			for(int r=0;r<rc;r++)//rownumber starts from 0
			{
				row=sh.getRow(r);//creates as many row objects as rownumber
				if(row==null) //optional
				{
					continue;
				}
				int cc=row.getPhysicalNumberOfCells();//shows no of cells in that particular row
				for(int c=0;c<cc;c++) 
				{
					cell=row.getCell(c);//creates objects for cells
					if(cell==null)
					{
						String data=" ";//displays that cell as blank without skipping-- otherwise shows null pointer exception
					}
					String data=cell.getStringCellValue();
					//System.out.println(data+"            ");
					System.out.printf("%-12s",data);//printf =to format output('-' formats the data on left hand side)('12' number can be changed looking at the alignment u want)
				}
				System.out.println();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				//memory deallocation 
				fin.close();
				wb.close();
				sh=null;
				row=null;
				cell=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
