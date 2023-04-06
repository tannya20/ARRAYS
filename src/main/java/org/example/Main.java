package org.example;

public class Main {
    public static void main(String[] args) {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        MinMonth minMonth = new MinMonth();
        minMonth.minSales(month);
    }
}
