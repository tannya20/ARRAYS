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

    @Test //среднюю сумму продаж в месяц
    public static void StatsServiceMonthAverage() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int i : month) {
            sum += i;
        }
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
}