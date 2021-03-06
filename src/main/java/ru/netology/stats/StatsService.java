package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {       // Сумма всех продаж
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {    // Средняя сумма продаж за месяц в году
        long sum = sumSales(sales);
        return sum / 12;
    }
//    public  long averageSale(long[] sales) {  // альтернативный код поиска среднего
//        return sumSales(sales) / sales.length;
//    }

    public int maxSaleMonth(long[] sales) {    // Ищем последний месяц с максимальной продажей
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi])     // Если искать первый месяц с максимальной продажей будет ">"
                maxi = i;
        }
        return maxi + 1;
    }

    public int minSaleMonth(long[] sales) {    // Ищем месяц с минимумумом продаж
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[mini])
                mini = i;
        }
        return mini + 1;
    }

//    public int underAverage(long[] sales) {     // Метод поиска кол-ва месяцев с продажами ниже средней за год
//        long sum = sumSales(sales);
//        int count = 0;
//        for (long sale : sales) {
//            if (sale < sum / 12)
//                count++;
//        }
//        return count;
//    }
    public int underAverage(long[] sales) {
        long avg = averageSale(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {           // можно записать if (sale < averageSale(sales)) но загрузит компилятор
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {      // Метод поиска кол-ва месяцев с продажами выше средней за год
        long sum = sumSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > sum / 12)
                count++;
        }
        return count;
    }
}

//    public int minSales(long[] sales) {
//        int minMonth = 0;
//        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
//        for (long sale : sales) {
//            // sales[minMonth] - продажи в месяце minMonth
//            // sale - продажи в рассматриваемом месяце
//            if (sale <= sales[minMonth]) {
//                minMonth = month;
//            }
//            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
//        }
//        return minMonth + 1;
//    }

