package excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import start.ExcelParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExcel {
    public static int sheetNumber = 0;
    public static ExcelParser excelParser = new ExcelParser();
    public static Workbook workbookNew = new HSSFWorkbook();
    public static Workbook workbookTemplate = new HSSFWorkbook();
    public static FileInputStream fileXls;

    static {
        try {
            fileXls = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\Итоговая таблица.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Workbook workbook;

    static {
        try {
            workbook = new HSSFWorkbook(fileXls);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCreateExcelParser(){
        ExcelParser excelParser = new ExcelParser();
    }

    @Test
    public void openExcelFile() throws IOException {
        FileInputStream fileXls = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\Итоговая таблица.xls");
        workbook = new HSSFWorkbook(fileXls);
    }

    @Test
    public void createNewFile() throws IOException {
        Workbook workbookNewFile = new HSSFWorkbook();
        excelParser.createSheet(workbook, workbookNewFile,"List1", sheetNumber);
        excelParser.createFile(workbookNewFile);
    }

    @Test
    public void createEmptySheet() throws IOException {
        workbookNew = excelParser.createEmptySheet(workbookNew, "list1");
    }

    @Test
    public void openTemplateFile() throws Exception {
        workbookTemplate = excelParser.openFile("template.xls");
        workbookTemplate = excelParser.enterHeader(workbookTemplate, "Sheet1");
    }
}
