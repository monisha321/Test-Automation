package com.sgtesting.Exceldemo;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFirstColumn {

	public static void main(String[] args) {
		writeContent();
	}                                         //write 20 fruit names in sheet 1 ,1st column
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
			sh=w.createSheet("fruit");
			List<String> l=new ArrayList<String>();
			for(int j=0;j<20;j++)
			{
				String s="fruit"+j;
				l.add(s);
			}

			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue(l.get(i));
			}

			fout=new FileOutputStream("E:/fruit.xlsx");
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
