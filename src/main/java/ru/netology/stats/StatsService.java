package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];

            }

        }
        return monthMaximum + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long saleMinimal = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }
        return counter;
    }
}
