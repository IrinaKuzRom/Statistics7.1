package ru.netology.stats.Statistics.services;
import java.util.stream.Stream;
import java.util.Arrays;
public class StatsService {
    public long summaSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / 12;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underAverageSales(long[] sales) {
        int counter = 0;
        long sum = 0;
        for (int y = 0; y < sales.length; y++) {
            sum += sales[y];
        }

        long avgSum = sum / 12;
        for (int i = 0; i < sales.length; i++) {
            if (avgSum > sales[i]) {
                counter++;
            }
        }
        return counter;
    }

    public int overAverageSales(long[] sales) {
        int counter = 0;
        long sum = 0;
        for (int y = 0; y < sales.length; y++) {
            sum += sales[y];
        }
        long avgSum = sum / 12;
        for (int i = 0; i < sales.length; i++) {
            if (avgSum < sales[i]) {
                counter++;
            }
        }
        return counter;
    }
}
