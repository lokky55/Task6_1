package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void FindSum() {
        StatsService service = new StatsService();
        int actual = service.sumSales(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindAverage() {
        StatsService service = new StatsService();
        long actual = service.averageSale(sales);
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void FindMonthWithMaxSale() {
        StatsService service = new StatsService();
        int actual = service.maxSaleMonth(sales);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void FindMonthWithMinSale() {
        StatsService service = new StatsService();
        int actual = service.minSaleMonth(sales);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void FindMonthWithSalesUnderAverage() {
        StatsService service = new StatsService();
        int actual = service.underAverage(sales);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void FindMonthWithSalesAboveAverage() {
        StatsService service = new StatsService();
        int actual = service.aboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}
//    @Test
//    public void FindMin() {
//        StatsService service = new StatsService();
//        int actual = service.minSales(sales);
//        int expected = 9;
//        Assertions.assertEquals(actual, expected);
//    }



