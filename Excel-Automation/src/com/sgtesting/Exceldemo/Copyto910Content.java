package com.sgtesting.Exceldemo;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Copyto910Content {

	public static void main(String[] args) {
		readWritecontent();

	}                                 //copy column 1 and 2 of sheet1 to --> row 9 and 10 of sheet2 
	static void readWritecontent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row row1=null;
		Row row2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		try
		{
			fin =new FileInputStream("E:\\flower.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			int r=sh1.getPhysicalNumberOfRows();
			row1=sh2.createRow(8);
			row2=sh2.createRow(9);
			int k=0;
			int m=0;
			for(int i=0;i<r;i++)
			{
				rowsh1=sh1.getRow(i);

				int c=rowsh1.getPhysicalNumberOfCells();
				for(int j=0;j<c;j++)
				{
					cellsh1=rowsh1.getCell(j);
					if(j==0)
					{
						
						
							cellsh2=row1.createCell(k);

							String data=cellsh1.getStringCellValue();
							cellsh2.setCellValue(data);
						k++;
					}
					else if(j==1)
					{
						
						
							cellsh2=row2.createCell(m);

							String data1=cellsh1.getStringCellValue();
							cellsh2.setCellValue(data1);
						m++;
					}
				}
				fout=new FileOutputStream("E:\\flower.xlsx");
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
				fout.close();
				wb.close();
				sh1=null;
				sh2=null;
				rowsh1=null;
				row1=null;
				cellsh1=null;
				cellsh2=null;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		}
	}
}

