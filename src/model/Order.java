package model;

public class Order {

    private Menu menu;
    private int count;

    public Order(Menu menu, int count) {
        if (count < 0) throw new IllegalArgumentException("메뉴의 개수는 0이하일 수 없습니다.");
        this.menu = menu;
        this.count = count;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getCount() {
        return count;
    }
}
