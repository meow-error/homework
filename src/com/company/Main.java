package com.company;

import org.apache.commons.math3.stat.StatUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\user\\IdeaProjects\\homework2\\info\\condition.xlsx");

        int variant = 7; // Номер варианта
        XSSFSheet sheet = workbook.getSheetAt(variant - 1);

        double array[][] = new double[sheet.getLastRowNum()][3];

        //int column = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= sheet.getLastRowNum(); j++){
                array[j - 1][i] = sheet.getRow(j).getCell(i).getNumericCellValue();
            }
        }

        workbook.close();

        for (int j = 0; j < sheet.getLastRowNum(); j++){
            System.out.println(array[j][2]);
        }

        ArrayList<Double[]> data = new ArrayList<>();

        LinkedHashMap<String,Double[]> lhm = new LinkedHashMap<>();

        //lhm.put("Среднее геометрическое", data.get(0));

        //data.add(StatUtils.geometricMean());

    }
}
