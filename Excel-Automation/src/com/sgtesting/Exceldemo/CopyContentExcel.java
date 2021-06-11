package com.sgtesting.Exceldemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyContentExcel {

	public static void main(String[] args) {
		copyContent();

	}                             //copy content from file 1 to file 2
	static void copyContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Sheet sh1=null;
		Row row=null;
		Row rowsh1=null;
		Cell cell=null;
		Cell cellsh1=null;
		FileOutputStream fout=null;
		try
		{
			fin=new FileInputStream("E:\\Test.xlsx");//reads file in byte stream =a fundamental stream class
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("sheet1");//creates sheet object
			sh1=wb.getSheet("sheet2");
			if(sh1==null)
			{
				sh1=wb.createSheet("info1");
			}
			int rc=sh.getPhysicalNumberOfRows();//to get number of rows that contains data
			for(int r=0;r<rc;r++)//rownumber starts from 0
			{
				row=sh.getRow(r);//creates as many row objects as rownumber
				
				rowsh1=sh1.getRow(r);
				if(rowsh1==null)
				{
					rowsh1=sh1.createRow(r);
				}
				
				
				int cc=row.getPhysicalNumberOfCells();//shows no of cells in that particular row
				for(int c=0;c<cc;c++) 
				{
					cell=row.getCell(c);//creates objects for cells
					
					cellsh1=rowsh1.getCell(c);
					if(cellsh1==null)
					{
						cellsh1=rowsh1.createCell(c);
					}
					String data=cell.getStringCellValue();
					cellsh1.setCellValue(data);
				}
				fout=new FileOutputStream("E:/new1.xlsx");
				wb.write(fout);
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
				sh1=null;
				row=null;
				rowsh1=null;
				cellsh1=null;
				cell=null;
				fout.flush();
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
