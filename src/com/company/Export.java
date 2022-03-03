package com.company;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Export {

    public void export(LinkedHashMap lhm) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        String surname = "Левадний";
        XSSFSheet sheet = workbook.createSheet(surname);

        Set set = lhm.entrySet();
        Iterator iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            XSSFRow row = sheet.createRow(i);
            Map.Entry data = (Map.Entry) iterator.next();
            row.createCell(0, CellType.STRING).setCellValue((String) data.getKey());
            Double[] mas = (Double[]) data.getValue();
            for (int j = 0; j < 3; j++) {
                row.createCell(j + 1, CellType.NUMERIC).setCellValue(((Double[]) data.getValue())[j]);
            }
            i++;
        }

        String path = "C:\\fileExcelExport.xlsx";
        File file = new File(path);
        workbook.write(new FileOutputStream(file));
        workbook.close();

    }

}
