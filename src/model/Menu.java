package model;

public class Menu {

    private String name;
    private int price;

    public Menu(String name, int price) {
        if (price < 0) throw new IllegalArgumentException("메뉴의 가격은 음수일 수 없습니다.");
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
