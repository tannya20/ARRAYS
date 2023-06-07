package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MonthTest {

    @Test //сумму всех продаж
    public static void StatsServiceMonthSum() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int i : month) {
            sum = sum + month[i];
        }
    }

    @Test //среднюю
    public static void StatsServiceMonthAverage() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int i : month) {
            sum += i;
        }
        //System.out.println("Средние сумму продаж в месяц равна ("+sum+")");
    }

    @Test //min
    public static void StatsServiceMonthMin() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int min = month[0];
        for (int i : month) {
            if (i < min) {
                min = i;
            }
        }
    }


    @Test //max
    public static void StatsServiceMonthMax() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int max = month[0];
        for (int i : month) {
            if (i > max) {
                max = i;
            }
        }
    }

    @Test //среднюю минимальное
    public static void StatsServiceMonthAverageMin() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int a : month) {
            sum += a;//a- среднее
            int min = month[0];
            for (int i : month) {
                if (a < min) {
                    min = i;
                }
            }
        }
    }

    @Test //среднюю Максимальное
    public static void StatsServiceMonthAverageMax() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int a : month) {
            sum += a;//a- среднееint
            int max = month[0];
            for (int i : month) {
                if (a > max) {
                    max = i;
                }
            }
        }
    }


// End Class MonthTest
}