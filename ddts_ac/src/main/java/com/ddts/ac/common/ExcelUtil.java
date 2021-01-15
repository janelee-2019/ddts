package com.ddts.ac.common;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow;

public class ExcelUtil
{
	public void writeToNew(List<String[]> table, String[] col_title, int[] col_width, String sheet_name, OutputStream out)
	{
		Workbook book = null;
		try
		{
			book = new XSSFWorkbook();
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}
		Sheet sheet = book.createSheet(sheet_name);

		// set title style
		Font title_font = book.createFont();
		title_font.setFontName("΢���ź�");
		title_font.setFontHeightInPoints((short) 10);
		title_font.setBold(true);
		CellStyle title_style = book.createCellStyle();
		title_style.setFont(title_font);
		title_style.setAlignment(HorizontalAlignment.CENTER);
		title_style.setVerticalAlignment(VerticalAlignment.CENTER);
		title_style.setBorderTop(BorderStyle.THIN);
		title_style.setBorderBottom(BorderStyle.THIN);
		title_style.setBorderLeft(BorderStyle.THIN);
		title_style.setBorderRight(BorderStyle.THIN);

		// set table style
		Font table_font = book.createFont();
		table_font.setFontName("΢���ź�");
		table_font.setFontHeightInPoints((short) 10);
		CellStyle table_style = book.createCellStyle();
		table_style.setFont(table_font);
		table_style.setWrapText(true);
		table_style.setVerticalAlignment(VerticalAlignment.CENTER);
		table_style.setBorderTop(BorderStyle.THIN);
		table_style.setBorderBottom(BorderStyle.THIN);
		table_style.setBorderLeft(BorderStyle.THIN);
		table_style.setBorderRight(BorderStyle.THIN);

		// write title
		Row row_title = sheet.createRow(0);
		row_title.setHeightInPoints((float) 21);
		for (int j = 0; j < col_title.length; j++)
		{
			row_title.createCell(j).setCellStyle(title_style);
			row_title.getCell(j).setCellValue(col_title[j]);
		}
		// write table
		for (int i = 0; i < table.size(); i++)
		{
			Row row = sheet.createRow(i + 1);
			row.setHeightInPoints((float) 21);
			for (int j = 0; j < col_title.length; j++)
			{
				row.createCell(j).setCellStyle(table_style);
				row.getCell(j).setCellValue(table.get(i)[j]);
			}
		}
		// set column width
		for (int i = 0; i < col_width.length; i++)
		{
			if (col_width[i] != 0)
				sheet.setColumnWidth(i, col_width[i]);
			else
				sheet.autoSizeColumn(i);
		}
		// set custom height of row
		for (int i = 0; i < table.size(); i++)
		{
			XSSFRow row = (XSSFRow) sheet.getRow(i + 1);
			CTRow ct_row = row.getCTRow();
			ct_row.setCustomHeight(false);
		}
		// export
		try
		{
			book.write(out);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void writeToTemplate(List<String[]> table, String file_path, OutputStream os)
	{

		Workbook book = null;
		Sheet sheet = null;
		try
		{
			book = new XSSFWorkbook(file_path);
			sheet = book.getSheetAt(0);
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}

		// write data
		for (int i = 0; i < table.size(); i++)
		{
			Row row = sheet.createRow(i + 1);
			for (int j = 0; j < table.get(i).length; j++)
				row.createCell(j).setCellValue(table.get(i)[j]);
		}
		// export
		try
		{
			// os = new FileOutputStream(new File(file_path));
			book.write(os);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}