package com.company.excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class Import {

    public static double[][] arr(String path) throws IOException {

        //path = "C:\\Users\\user\\IdeaProjects\\homework2\\info\\condition.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook(path);

        int variant = 7; // Номер варианта
        XSSFSheet sheet = workbook.getSheetAt(variant - 1);

        double[][] arr = new double[3][sheet.getLastRowNum()];
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= sheet.getLastRowNum(); j++) {
                arr[i][j - 1] = sheet.getRow(j).getCell(i).getNumericCellValue();
            }
        }
        workbook.close();

        return arr;

    }
}
