package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MonthTest {

    @Test
    public void StatsServiceMonth() {
        StatsService service = new StatsService();

        int[] Month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   //набор данных о продажах конкретного предприятия по месяцам

        int expectedMonth = 1;

        Assertions.assertEquals(expectedMonth, StatsService.minSales(Month));
    }

//    @Test //сумму всех продаж
//
//    @Test //среднюю сумму продаж в месяц
//
//    @Test //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
//
//    @Test //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
//
//    @Test //количество месяцев, в которых продажи были ниже среднего
//
//    @Test //количество месяцев, в которых продажи были выше среднего

}