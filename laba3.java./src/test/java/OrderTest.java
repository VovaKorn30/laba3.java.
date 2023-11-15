import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderTest {
    @Mock
    private Order order;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createOrder() {
        Order newOrder = mock(Order.class);
        when(newOrder.getOrderId()).thenReturn(2);
        when(order.getOrders()).thenReturn(List.of(newOrder));

        order.createOrder(newOrder);

        assertEquals(1, order.getOrders().size());
    }


    @Test
    void getOrderStatus() {
        Order newOrder = mock(Order.class);
        when(order.getOrders()).thenReturn(List.of(newOrder));
        when(newOrder.getOrderId()).thenReturn(1);
        when(newOrder.getStatus()).thenReturn("В обробці");
        order.getOrderStatus(1);
        // Очікуємо вивід "ID замовлення: 1 має статус 'В обробці'"
    }

}