import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CartTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach
    void setUp() {
        cart = new Cart();
        product1 = mock(Product.class);
        product2 = mock(Product.class);
    }

    @Test
    void testAddProduct() {
        when(product1.getId()).thenReturn(1);
        when(product2.getId()).thenReturn(2);

        cart.addProduct(product1);
        cart.addProduct(product2);

        assertEquals(2, cart.getProducts().size());
    }

    @Test
    void testRemoveProduct() {
        when(product1.getId()).thenReturn(1);
        when(product2.getId()).thenReturn(2);

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.removeProduct(2);

        assertEquals(1, cart.getProducts().size());
    }
}