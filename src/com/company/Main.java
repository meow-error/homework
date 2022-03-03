package com.company;

import org.apache.commons.math3.stat.StatUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\user\\IdeaProjects\\homework2\\info\\condition.xlsx");

        int variant = 7; // Номер варианта
        XSSFSheet sheet = workbook.getSheetAt(variant - 1);


        double[][] arr = new double[3][sheet.getLastRowNum()];
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= sheet.getLastRowNum(); j++) {
                arr[i][j - 1] = sheet.getRow(j).getCell(i).getNumericCellValue();
            }
        }
        workbook.close();

    }
}
