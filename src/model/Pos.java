package model;

public class Pos {

    public Pos() {
    }

    public int getChange(Customer customer) {
        int cash = customer.getCash();
        Orders orders = customer.getOrders();//주문서
        int totalPrice = orders.getTotalPrice(); //지불해야하는 가격
        return cash - totalPrice;
    }
}
