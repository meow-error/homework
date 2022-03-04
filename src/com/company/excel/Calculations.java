package com.company.excel;

import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.correlation.Covariance;

import java.util.LinkedHashMap;

public class Calculations {

    public static LinkedHashMap<String, Double[]> lhm = new LinkedHashMap<>();

    // 1.	Рассчитать среднее геометрическое для каждой выборки
    private static void geom(double[][] arr) {
        Double[] geom = new Double[3];
        for (int i = 0; i < 3; i++) {
            geom[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", geom);
    }

    // 2.	Рассчитать среднее арифметическое для каждой выборки
    private static void mean(double[][] arr) {
        Double[] mean = new Double[3];
        for (int i = 0; i < 3; i++) {
            mean[i] = StatUtils.mean(arr[i]);
        }
        lhm.put("Среднее арифметическое", mean);
    }

    // 3.	Рассчитать оценку стандартного отклонения для каждой выборки
    private static void variance(double[][] arr) {
        Double[] variance = new Double[3];
        for (int i = 0; i < 3; i++) {
            variance[i] = Math.sqrt(StatUtils.variance(arr[i]));
        }
        lhm.put("Стандартное отклонение", variance);
    }

    // 4.	Рассчитать размах каждой выборки
    private static void range(double[][] arr) {
        Double[] range = new Double[3];
        for (int i = 0; i < 3; i++) {
            range[i] = StatUtils.max(arr[i]) - StatUtils.min(arr[i]);
        }
        lhm.put("Размах", range);
    }

    // 5.	Рассчитать коэффициенты ковариации для всех пар случайных чисел
    private static void covariance(double[][] arr) {
        Double[] covariance = new Double[3];
        covariance[0] = new Covariance().covariance(arr[0], arr[1]);
        covariance[1] = new Covariance().covariance(arr[0], arr[2]);
        covariance[2] = new Covariance().covariance(arr[1], arr[2]);
        lhm.put("Коэффициенты ковариации", covariance);
    }

    // 6.	Рассчитать количество элементов в каждой выборке
    private static void number(double[][] arr) {
        Double[] number = new Double[3];
        for (int i = 0; i < 3; i++) {
            number[i] = Double.valueOf(arr[i].length);
        }
        lhm.put("Количество элементов", number);
    }

    // 7.	Рассчитать коэффициент вариации для каждой выборки
    private static void variation(double[][] arr) {
        Double[] variance = new Double[3];
        for (int i = 0; i < 3; i++) {
            variance[i] = Math.sqrt(StatUtils.variance(arr[i])) / Math.abs(StatUtils.mean(arr[i]));
        }
        lhm.put("Коэффициент вариации", variance);
    }

    // 8.	Рассчитать для каждой выборки построить доверительный интервал для мат. ожидания
    private static void minusInterval(double[][] arr) {
        Double[] interval = new Double[3];
        for (int i = 0; i < 3; i++) {
            interval[i] = StatUtils.mean(arr[i]) - (new TDistribution(arr[i].length - 1).inverseCumulativeProbability(0.95) * Math.sqrt(StatUtils.variance(arr[i]))) / Math.sqrt(arr[i].length);
        }
        lhm.put("-Доверительный интервал", interval);
    }

    private static void plusInterval(double[][] arr) {
        Double[] interval = new Double[3];
        for (int i = 0; i < 3; i++) {
            interval[i] = StatUtils.mean(arr[i]) + (new TDistribution(arr[i].length - 1).inverseCumulativeProbability(0.95) * Math.sqrt(StatUtils.variance(arr[i]))) / Math.sqrt(arr[i].length);
        }
        lhm.put("+Доверительный интервал", interval);
    }

    // 9.	Рассчитать оценку дисперсии для каждой выборки
    private static void dispersion(double[][] arr) {
        Double[] dispersion = new Double[3];
        for (int i = 0; i < 3; i++) {
            dispersion[i] = StatUtils.variance(arr[i]);
        }
        lhm.put("Оценка дисперсии", dispersion);
    }

    // 10.	Рассчитать максимумы для каждой выборки
    private static void max(double[][] arr) {
        Double[] max = new Double[3];
        for (int i = 0; i < 3; i++) {
            max[i] = StatUtils.max(arr[i]);
        }
        lhm.put("Максимумы", max);
    }

    // 11.	Рассчитать минимумы для каждой выборки
    private static void min(double[][] arr) {
        Double[] min = new Double[3];
        for (int i = 0; i < 3; i++) {
            min[i] = StatUtils.min(arr[i]);
        }
        lhm.put("Минимумы", min);
    }

    public static void calc(double[][] arr) {
        geom(arr);
        mean(arr);
        variance(arr);
        range(arr);
        covariance(arr);
        number(arr);
        variation(arr);
        minusInterval(arr);
        plusInterval(arr);
        dispersion(arr);
        max(arr);
        min(arr);
    }

}

