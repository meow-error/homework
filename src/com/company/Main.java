package com.company;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\user\\IdeaProjects\\homework2\\info\\condition.xlsx");

        int number = 7; // Номер варианта
        XSSFSheet sheet = workbook.getSheetAt(number - 1);

        double array0[] = new double[sheet.getLastRowNum()];

        int column = 0;
        for (int i = 1; i <= sheet.getLastRowNum(); i++){
            array0[i - 1] = sheet.getRow(i).getCell(column).getNumericCellValue();
        }

        workbook.close();

        for (double line: array0) {
            System.out.println(line);
        }





    }
}
