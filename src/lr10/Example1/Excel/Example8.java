package lr10.Example1.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Example8 {
    public static void main(String[] args) throws IOException {

        // Путь к файлу Excel
        String filePath = "src/lr10/Example1/Excel/example8.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        // Создание объекта Workbook
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Получение листа по имени
        XSSFSheet sheet = workbook.getSheet("Лист1");

        if (sheet == null) {
            System.out.println("Лист не найден в Excel.");
        } else {
            // Чтение данных из таблицы
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Вывод ячейки в консоль
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        }
        workbook.close();
        inputStream.close();
    }
}