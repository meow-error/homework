package com.company;

import com.company.excel.Calculations;
import com.company.excel.Export;
import com.company.excel.Import;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI extends JFrame{
    private JButton importFileButton;
    private JButton exportFileButton;
    private JTextField importField;
    private JTextField exportField;
    private JPanel panel;

    public GUI() {

        setContentPane(panel);
        setTitle("Lab1_V7");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1000,500);


        importFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Calculations.calc(Import.arr(importField.getText()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        exportFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Export.export(Calculations.lhm, exportField.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) throws IOException {

        new GUI();

        // СДЕЛАТЬ:
        // Вычисления дописать рабочие
        // ГУИ сделать с кнопками
        // Связать это все
        // Написать исключения для работы с ошибками
        // ???
    }
}
