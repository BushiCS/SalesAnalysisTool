public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{10,15,50,30});
        salesManager.max();
        System.out.println(salesManager);
        System.out.println("Класс!");
    }
}
