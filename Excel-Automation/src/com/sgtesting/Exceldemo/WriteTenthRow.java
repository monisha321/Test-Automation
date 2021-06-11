package com.sgtesting.Exceldemo;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTenthRow {

	public static void main(String[] args) {
		writeContent();

	}                                     //write 20 color names in sheet 1 in 10th row
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
			sh=w.createSheet("color");
			List<String> l=new ArrayList<String>();
			for(int j=0;j<20;j++)
			{
				String s="color"+j;
				l.add(s);
			}

			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				if(i==9)
				{
					for(int j=0;j<20;j++)
					{
						cell=row.createCell(j);


						cell.setCellValue(l.get(j));

					}
				}
			}

			fout=new FileOutputStream("E:/color.xlsx");
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
