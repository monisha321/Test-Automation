package com.sgtesting.Exceldemo;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDiagonally {

	public static void main(String[] args) {
		writeContent();

	}                                           //write 12  months diagonally in a sheet
	static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook w=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try
		{
			w=new XSSFWorkbook();
			sh=w.createSheet("months");
			List<String> l=new ArrayList<String>();
			for(int j=0;j<12;j++)
			{
				String s="month"+j;
				l.add(s);
			}
		

			for(int i=0;i<12;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				cell.setCellValue(l.get(i));
			}

			fout=new FileOutputStream("E:/month.xlsx");
			w.write(fout);

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
