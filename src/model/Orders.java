package model;

import java.util.List;

public class Orders {
    private List<Order> orders;
    private int totalPrice;

    public Orders(List<Order> orders) {
        this.orders = orders;
        this.totalPrice = orders.stream()
                .mapToInt(order -> order.getMenu().getPrice() * order.getCount())
                .sum();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
