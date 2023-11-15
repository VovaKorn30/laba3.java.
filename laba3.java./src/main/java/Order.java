import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int orderId;
    private final String status;
    private final List<Product> orderProducts;
    private final ArrayList<Order> orders;

    public Order(int orderId, Cart orderCart, String status) {
        this.orderId = orderId;
        this.orderProducts = (List<Product>) orderCart;
        this.status = status;
        this.orders = new ArrayList<>();
    }


    public void createOrder(Order order) {
        this.orders.add(order);
    }

    public void getOrderStatus(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                System.out.println("ID замовлення: " + orderId + " має статус " + "'" + order.getStatus() + "'");
                return;
            }
        }
    }

    public List<Order> getOrders() {
        return orders;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public List<Product> getOrderProducts() {
        return orderProducts;
    }
}