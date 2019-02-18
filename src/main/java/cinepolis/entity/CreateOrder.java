package cinepolis.entity;

public class CreateOrder {

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "CreateOrder{" +
                "order=" + order +
                '}';
    }
}
