import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int avg() {
        int avg;
        int sum = 0;
        Arrays.sort(sales); // Отсортировка по возрастанию
        int[] trimmedSales = Arrays.copyOfRange(sales, 1, sales.length - 1); // Убираем крайние показатели
        for (int sale : trimmedSales) {
            sum += sale;
        }
        avg = sum / trimmedSales.length; // расчет среднего арифметического
        return avg;
    }

    public String toString() {
        return "Max sale: " + max() + "\n" + "Average sale: " + avg();
    }
}
