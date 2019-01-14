package com;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class EXCELUtil1 {
	 public static void main(String[] args) throws IOException {
		 Workbook wb = new SXSSFWorkbook(100); // keep 100 rows in memory, exceeding rows will be flushed to disk 
		 Sheet sh = wb.createSheet(); 
		 for(int rownum = 0; rownum < 100000; rownum++){
		 Row row = sh.createRow(rownum); 
		 for(int cellnum = 0; cellnum < 10; cellnum++){ 
		 Cell cell = row.createCell(cellnum); 
		 String address = new CellReference(cell).formatAsString(); 
		 cell.setCellValue(address); } 
		 }
		FileOutputStream out = new FileOutputStream("D:/数据分析报表.xlsx");
		 wb.write(out); 
		 out.close();
		 
		 
}}
