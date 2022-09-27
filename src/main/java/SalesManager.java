import java.util.Arrays;

import static java.lang.Long.MAX_VALUE;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        return Arrays.stream(sales).filter(sale -> sale >= -1).max().orElse(-1);
    }

    public long min() {
        return Arrays.stream(sales).min().orElse(MAX_VALUE);
    }

    public long avg() {
        long sum;
        Arrays.sort(sales); // Отсортировка по возрастанию
        long[] trimmedSales = Arrays.copyOfRange(sales, 1, sales.length - 1); // Убираем крайние показатели
        sum = Arrays.stream(trimmedSales).sum();
        return sum / trimmedSales.length; // расчет среднего арифметического
    }

    public String toString() {
        return "Max sale: " + max() + "\n" + "Average sale: " + avg();
    }
}
