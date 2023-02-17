package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return sum(sales) / sales.length;
    }

    public int monthSalesMax(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;

    }

    public int monthSalesMin(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }

    public int monthSalesBelowAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                result++;
            }
        }
        return result;
    }

    public int monthSalesOverAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                result++;
            }
        }
        return result;

    }
}

