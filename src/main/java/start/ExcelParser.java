package start;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelParser {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("New Sheet");
        FileOutputStream file = new FileOutputStream("C:\\Users\\Mikhail\\IdeaProjects\\ChessMatch\\src\\main\\resources\\excel\\test.xlsx");
        workbook.write(file);
        file.close();
    }
}
