package com.sgtesting.Exceldemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyContent12Reverse {

	public static void main(String[] args) {
		copyContent();
	}                                 //copy column 1 and 2 of sheet 1 to --->column 1 and 2 of sheet 2 in reverse order
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
			fin=new FileInputStream("E:\\file1.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("sheet1");
			sh1=wb.getSheet("sheet2");
			if(sh1==null)
			{
				sh1=wb.createSheet("sheet2");
			}
			int rc=sh.getPhysicalNumberOfRows();
			int k=1;
			for(int r=rc-1;r>=0;r--)
			{
				row=sh.getRow(r);

				rowsh1=sh1.getRow(k);
				if(rowsh1==null)
				{
					rowsh1=sh1.createRow(k);
				}


				int cc=row.getPhysicalNumberOfCells();
				
				for(int c=0;c<cc;c++) 
				{
					cell=row.getCell(c);

					cellsh1=rowsh1.getCell(c);
					if(cellsh1==null)
					{
						cellsh1=rowsh1.createCell(c);
					}
					String data=cell.getStringCellValue();
					cellsh1.setCellValue(data);
					
				}
				k++;
				fout=new FileOutputStream("E:/file1.xlsx");
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
