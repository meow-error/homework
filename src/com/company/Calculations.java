package com.company;

import org.apache.commons.math3.stat.StatUtils;
import java.util.LinkedHashMap;

public class Calculations {

    LinkedHashMap<String, Double[]> lhm = new LinkedHashMap<>();

    // 1.	Рассчитать среднее геометрическое для каждой выборки
    public void geom(double[][] arr) {
        Double[] geom = new Double[3];
        for (int i = 0; i < 3; i++) {
            geom[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее геометрическое", geom);
    }

    // 2.	Рассчитать среднее арифметическое для каждой выборки
    public void mean(double[][] arr) {
        Double[] mean = new Double[3];
        for (int i = 0; i < 3; i++) {
            mean[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Среднее арифметическое", mean);
    }

    // 3.	Рассчитать оценку стандартного отклонения для каждой выборки
    public void variance(double[][] arr) {
        Double[] variance = new Double[3];
        for (int i = 0; i < 3; i++) {
            variance[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Стандартное отклонение", variance);
    }

    // 4.	Рассчитать размах каждой выборки
    public void range(double[][] arr) {
        Double[] range = new Double[3];
        for (int i = 0; i < 3; i++) {
            range[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Размах", range);
    }

    // 5.	Рассчитать коэффициенты ковариации для всех пар случайных чисел
    public void covarience(double[][] arr) {
        Double[] covariance = new Double[3];
        for (int i = 0; i < 3; i++) {
            covariance[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Коэффициенты ковариации", covariance);
    }

    // 6.	Рассчитать количество элементов в каждой выборке
    public void number(double[][] arr) {
        Double[] number = new Double[3];
        for (int i = 0; i < 3; i++) {
            number[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Количество элементов", number);
    }

    // 7.	Рассчитать коэффициент вариации для каждой выборки
    public void variation(double[][] arr) {
        Double[] variation = new Double[3];
        for (int i = 0; i < 3; i++) {
            variation[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Коэффициент вариации", variation);
    }

    // 8.	Рассчитать для каждой выборки построить доверительный интервал для мат. ожидания
    public void interval(double[][] arr) {
        Double[] interval = new Double[3];
        for (int i = 0; i < 3; i++) {
            interval[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Доверительный интервал", interval);
    }

    // 9.	Рассчитать оценку дисперсии для каждой выборки
    public void dispersion(double[][] arr) {
        Double[] dispersion = new Double[3];
        for (int i = 0; i < 3; i++) {
            dispersion[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Оценка дисперсии", dispersion);
    }

    // 10.	Рассчитать максимумы для каждой выборки
    public void max(double[][] arr) {
        Double[] max = new Double[3];
        for (int i = 0; i < 3; i++) {
            max[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Максимумы", max);
    }

    // 11.	Рассчитать минимумы для каждой выборки
    public void min(double[][] arr) {
        Double[] min = new Double[3];
        for (int i = 0; i < 3; i++) {
            min[i] = StatUtils.geometricMean(arr[i]);
        }
        lhm.put("Минимумы", min);
    }

}

