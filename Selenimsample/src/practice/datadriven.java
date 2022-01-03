package practice;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("./excel/demo3.xlsx");
		Workbook bk=WorkbookFactory.create(fs);
		org.apache.poi.ss.usermodel.Sheet sh=bk.getSheet("sheet1");
		
		Row r= ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
		
		Cell c=r.getCell(1);
		String valu = c.toString();
		System.out.println(valu);
		
		
		
		// TODO Auto-generated method stub

	}

}
