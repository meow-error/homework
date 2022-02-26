package com.company;

import org.apache.commons.math3.stat.StatUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\user\\IdeaProjects\\homework2\\info\\condition.xlsx");

        int variant = 7; // Номер варианта
        XSSFSheet sheet = workbook.getSheetAt(variant - 1);


        double arr[][] = new double[3][sheet.getLastRowNum()];
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= sheet.getLastRowNum(); j++){
                arr[i][j - 1] = sheet.getRow(j).getCell(i).getNumericCellValue();
            }
        }
        workbook.close();

        LinkedHashMap<String,Double[]> lhm = new LinkedHashMap<>();

        // 1.	Рассчитать среднее геометрическое для каждой выборки
        Double[] geom = new Double[3];
        for (int i = 0; i < 3; i++) {
           geom[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", geom);



        // 2.	Рассчитать среднее геометрическое для каждой выборки
        Double[] mean = new Double[3];
        for (int i = 0; i < 3; i++) {
            mean[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", mean);



        // 3.	Рассчитать среднее геометрическое для каждой выборки
        Double[] variance = new Double[3];
        for (int i = 0; i < 3; i++) {
            variance[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", variance);



        // 4.	Рассчитать среднее геометрическое для каждой выборки
        Double[] range = new Double[3];
        for (int i = 0; i < 3; i++) {
            range[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", range);




        // 5.	Рассчитать среднее геометрическое для каждой выборки
        Double[] covariance = new Double[3];
        for (int i = 0; i < 3; i++) {
            covariance[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", covariance);




        // 6.	Рассчитать среднее геометрическое для каждой выборки
        Double[] number = new Double[3];
        for (int i = 0; i < 3; i++) {
            number[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", number);



        // 7.	Рассчитать среднее геометрическое для каждой выборки
        Double[] variation = new Double[3];
        for (int i = 0; i < 3; i++) {
            variation[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", variation);



        // 8.	Рассчитать среднее геометрическое для каждой выборки
        Double[] interval = new Double[3];
        for (int i = 0; i < 3; i++) {
            interval[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", interval);



        // 9.	Рассчитать среднее геометрическое для каждой выборки
        Double[] dispersion = new Double[3];
        for (int i = 0; i < 3; i++) {
            dispersion[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", dispersion);



        // 10.	Рассчитать среднее геометрическое для каждой выборки
        Double[] max = new Double[3];
        for (int i = 0; i < 3; i++) {
            max[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", max);

        // 11.	Рассчитать среднее геометрическое для каждой выборки
        Double[] min = new Double[3];
        for (int i = 0; i < 3; i++) {
            min[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", min);


    }
}
