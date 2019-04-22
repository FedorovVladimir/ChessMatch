package excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import start.ExcelParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExcel {
    @Test
    public void testCreateExcelParser(){
        ExcelParser excelParser = new ExcelParser();
    }
    @Test
    public void openExcelFile() throws IOException {
        FileInputStream fileXls = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\Итоговая таблица.xls");
        Workbook workbook = new HSSFWorkbook(fileXls);
    }

}
