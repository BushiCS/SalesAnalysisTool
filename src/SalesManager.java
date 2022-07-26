import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long avg() {
        long avg;
        long sum = 0;
        Arrays.sort(sales); // Отсортировка по возрастанию
        long[] trimmedSales = Arrays.copyOfRange(sales, 1, sales.length - 1); // Убираем крайние показатели
        for (long sale : trimmedSales) {
            sum += sale;
        }
        avg = sum / trimmedSales.length; // расчет среднего арифметического
        return avg;
    }

    public String toString() {
        return "Max sale: " + max() + "\n" + "Average sale: " + avg();
    }
}
