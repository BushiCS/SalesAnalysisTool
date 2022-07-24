public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{10,15,50,30});
        salesManager.max();
        System.out.println(salesManager);
    }
}
