package start;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;
import org.hibernate.jdbc.Work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ExcelParser {
    public ExcelParser(){}
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public static int sheetNumber = 0;
    private DataBase dataBase = new EmptyDataBase();

    public static void main(String[] args) throws IOException {

        //Open and read total table file
        FileInputStream fileXls = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\Итоговая таблица.xls");
        Workbook workbook = new HSSFWorkbook(fileXls);

        //Create new file
        Workbook workbookNewFile = new HSSFWorkbook();
        createSheet(workbook, workbookNewFile,"List1", sheetNumber);
        createFile(workbookNewFile);

        //Open and read new file
        fileXls = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\test.xls");
        workbookNewFile = new HSSFWorkbook(fileXls);
        getSheet(workbookNewFile, sheetNumber);
    }

    public static void  createSheet(Workbook workbook, Workbook workbookNewFile, String nameSheet, int sheetNumber){
        Sheet sheet = workbookNewFile.createSheet(nameSheet);
        int i = 0, j = 0;

        for (Row row : workbook.getSheetAt(sheetNumber)) {
            Row rowNew = sheet.createRow(i);
            j = 0;
            for (Cell cell : row) {
                Cell cellNew = rowNew.createCell(j);
                cellNew.setCellValue(getCellText(cell));
                //System.out.println(getCellText(cell));
                j++;
                sheet.autoSizeColumn(j);
            }
            i++;
        }
        addMerged(sheet, 0,0, 0, 30);
        addMerged(sheet, 2,2, 0, 3);
        addMerged(sheet, 141,141, 3, 4);
    }

    public static void addMerged(Sheet sheet, int firstRow, int lastRow, int firstCol, int lastCol){
        sheet.addMergedRegion(new CellRangeAddress(
                firstRow, //first row (0-based)
                lastRow, //last row (0-based)
                firstCol, //first column (0-based)
                lastCol //last column (0-based)
        ));
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
                    //textCell = Double.toString(cell.getNumericCellValue());
                    textCell = Integer.toString((int)cell.getNumericCellValue());
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

    public Workbook createEmptySheet(Workbook workbook, String name) throws IOException {
        Sheet sheet = workbook.createSheet(name);
        FileOutputStream file = new FileOutputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\table.xls");
        workbook.write(file);
        file.close();
        return workbook;
    }

    public void writeFile(Workbook workbook, String nameFile) throws IOException {
        FileOutputStream file = new FileOutputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\" + nameFile);
        workbook.write(file);
        file.close();
    }

    public Workbook openFile(String s) throws IOException {
        FileInputStream fileXls = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\" + s);
        Workbook workbook = new HSSFWorkbook(fileXls);
        Sheet a = workbook.getSheetAt(0);
        return workbook;
    }

    public Workbook enterHeader(Workbook workbookTemplate, String sheetName) throws Exception {
        Sheet sheet = workbookTemplate.getSheetAt(0);
        for (int i = 0; i < 4; i++) {
            Row rowNew = sheet.createRow(i);
            for (int j = 0; j < 15; j++) {
                if (i == 0 && j == 0) {
                    Cell cellNew = rowNew.createCell(j);
                    cellNew.setCellValue(dataBase.getMatch(1).getNameTour());
                }
                if (i == 2 && j == 0){
                    Cell cellNew = rowNew.createCell(j);
                    cellNew.setCellValue(dataBase.getMatch(1).getCity());
                }
            }
        }
        addMerged(sheet, 0,0, 0, 15);
        addMerged(sheet, 2,2, 0, 2);
        writeFile(workbookTemplate, "template.xls");
        return workbookTemplate;
    }
}
