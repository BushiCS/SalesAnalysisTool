public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new long[]{10, 15, 50, 30, 28, 39, 72, 44});
        salesManager.min();
        salesManager.max();
        salesManager.avg();
    }
}
