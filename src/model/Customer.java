package model;

public class Customer {

    private String name;
    private int cash;
    private Orders orders;

    public Customer(int cash, String name) {
        this.cash = cash;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public Orders getOrders() {
        return orders;
    }

    public void order(Orders orders) {
        this.orders = orders;
    }
}
