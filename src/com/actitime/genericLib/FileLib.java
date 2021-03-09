package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String getpropertyvalue(String path, String key) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String propvalue = prop.getProperty(key, "inncorrect key");
		return propvalue;	
	}
	//Generic reusable method to read data from excel
			public String getcelldata(String path, String sheetName, int row, int cell) throws Throwable
			{
				FileInputStream fis = new FileInputStream(path);
				Workbook wb = WorkbookFactory.create(fis);
				String val = wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
				return val;
			}
			
		//Generic reusable method to write data into excel
		public void setcelldada(String path, String sheet, int row, int cell, String data) throws Throwable
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
			FileOutputStream fos = new FileOutputStream(path);
			wb.write(fos);
		}
		
		//Generic reusable method to count rows filled in a particular sheet of an excel
		//Generic reusable method to write data into excel
			public int getRowCount(String path, String sheet) throws Throwable
			{
				FileInputStream fis = new FileInputStream(path);
				Workbook wb = WorkbookFactory.create(fis);
				int rc = wb.getSheet(sheet).getLastRowNum();
				return rc;
			}

	}


