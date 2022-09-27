import org.junit.jupiter.api.*;

@DisplayName("Тестирование SalesManager")
public class SalesManagerTest {

    private SalesManager salesManager;

    @Test
    @DisplayName("проверка максимального значения")
    void maxTest() {
        salesManager = new SalesManager(new long[]{3, 2, 5, 1, 7, 9, 4, 8});
        Assertions.assertEquals(9, salesManager.max());
    }

    @Test
    @DisplayName("проверка среднего усеченного")
    void avg() {
        salesManager = new SalesManager(new long[]{15, 12, 14, 11, 17, 19, 16, 18});
        Assertions.assertEquals(15, salesManager.avg());
    }

    @Test
    @DisplayName("проверка минимального значения")
    void minTest() {
        salesManager = new SalesManager(new long[]{50, 35, 12, 81, 42, 4, 71});
        Assertions.assertEquals(4, salesManager.min());
    }

}
