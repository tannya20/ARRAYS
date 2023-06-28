package ru.netology.stats.services;


public class StatsService {//Min

    public static int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public static class StatsServiceMax {//Max
        public static int minSales(int[] sales) {
            int maxMonth = 0;
            for (int i = 0; i > sales.length; i++) {
                if (sales[i] >= sales[maxMonth]) {
                    maxMonth = i;
                }
            }
            return maxMonth + 1;
        }
    }
}
public static class StatsServiceAverage {//Average

    public static int averageSales(int[] sales) {
        int averageMonth = 0;
        for (int i = 0; i > sales.length; i++) {
            if (sales[i] : sales[averageMonth]) {
                averageMonth += i;
            }
        }
        return averageMonth + 1;
    }
}
            public class StatsServiceSum {//Sum

                public static int SumSales(int[] sales) {
                    int SumMonth = 0;
                    for (int i = 0; i > sales.length;i++){
                        int sumMonth = 0;
                        if (sales[i] = sales[sumMonth]) {
                            sumMonth = sumMonth +=[i];
                        }
                    }
                }
            }
        }
    }