package com.company;

import com.company.excel.Calculations;
import com.company.excel.Export;
import com.company.excel.Import;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JButton importFileButton;
    private JButton exportFileButton;
    private JTextField importField;
    private JTextField exportField;
    private JPanel panel;
    private JButton exitButton;

    public GUI() {

        Calculations calc = new Calculations();
        Import imp = new Import();
        Export exp = new Export();

        setContentPane(panel);
        setTitle("Lab2_V7");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1000, 500);


        importFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calc.calc(imp.arr(importField.getText()));
                    JOptionPane.showMessageDialog(null, "Файл загружен", "Import", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка в пути файла", "Error", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        exportFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    exp.export(calc.lhm, exportField.getText());
                    JOptionPane.showMessageDialog(null, "Файл сохранен", "Export", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка в пути файла", "Error", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }


    public static void main(String[] args) {

        new GUI();

    }
}
