package com.company;

import com.company.excel.Calculations;
import com.company.excel.Export;
import com.company.excel.Import;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        Calculations.calc(Import.arr());
        Export.export(Calculations.lhm);

    }
}
