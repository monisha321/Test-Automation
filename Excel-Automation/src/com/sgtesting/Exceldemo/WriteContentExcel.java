package com.sgtesting.Exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteContentExcel {

	public static void main(String[] args) {
		writeContent();
	}
	static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("info");
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("user1");
			cell=row.createCell(1);
			cell.setCellValue("password1");
			
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("user2");
			cell=row.createCell(1);
			cell.setCellValue("password2");
			fout=new FileOutputStream("E:/new.xlsx");
			wb.write(fout);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.flush();
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
