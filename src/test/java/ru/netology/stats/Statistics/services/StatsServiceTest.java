package ru.netology.stats.Statistics.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Statistics.services.StatsService;

public class StatsServiceTest {
    @Test
    public void summaSale(){
        StatsService service=new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.summaSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void averageSale(){
        StatsService service=new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(sales);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void maxSale() {
        StatsService service=new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void minSale() {
        StatsService service=new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void underAverageSale() {
        StatsService service=new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.underAverageSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void overAverageSale() {
        StatsService service=new StatsService();
        long[] sales = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = service.overAverageSales(sales);
        Assertions.assertEquals(expected,actual);
    }
}
