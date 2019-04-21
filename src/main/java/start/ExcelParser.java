package start;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ExcelParser {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        createSheet(workbook, "List1");
        createFile(workbook);
        FileInputStream fileXls = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\test.xls");
        workbook = new HSSFWorkbook(fileXls);
        getSheet(workbook, 0);

        fileXls = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\Итоговая таблица.xls");
        workbook = new HSSFWorkbook(fileXls);
        getSheet(workbook, 0);
    }

    public static void  createSheet(Workbook workbook, String nameSheet){
        Sheet sheet = workbook.createSheet(nameSheet);
        Row rowOne = sheet.createRow(0);
        Cell cellOne = rowOne.createCell(0);
        cellOne.setCellValue("AAA");
    }

    public static void createFile(Workbook workbook) throws IOException {
        FileOutputStream file = new FileOutputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\test.xls");
        workbook.write(file);
        file.close();
    }

    public static String getCellText(Cell cell){
        String textCell = "";
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                textCell = cell.getRichStringCellValue().getString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    textCell = simpleDateFormat.format(cell.getDateCellValue());
                } else {
                    textCell = Double.toString(cell.getNumericCellValue());
                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                textCell = Boolean.toString(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_FORMULA:
                textCell = cell.getCellFormula().toString();
                break;
            default:
                break;
        }
        return textCell;
    }

    public static void getSheet(Workbook workbook, int sheetNumber) {
        for (Row row : workbook.getSheetAt(sheetNumber)) {
            for (Cell cell : row) {
                CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                System.out.print(cellRef.formatAsString());
                System.out.print(" - ");
                System.out.println(getCellText(cell));
            }
        }
    }
}
