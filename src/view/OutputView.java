package view;

import model.Orders;
import model.Restaurant;

import java.util.List;

public class OutputView {

    private static void printSeparator() {
        System.out.println("##########################");
    }

    public static void printRestaurants(List<Restaurant> restaurants) {
        printSeparator();
        System.out.println("식당들 소개");
        restaurants.forEach(OutputView::printRestaurant);
    }

    public static void printRestaurant(Restaurant restaurant) {
        printSeparator();
        System.out.println(String.format("식당 이름 : %s", restaurant.getName()));
        printSeparator();
        System.out.println("메뉴");
        restaurant.getMenus().entrySet().stream().forEach(
                entry -> {
                    System.out.println(String.format("%s : %d원", entry.getKey(), entry.getValue().getPrice()));
                }
        );
    }

    public static void printReselectRestaurant() {
        System.out.println("입력한 식당이름은 존재하지 않습니다. 다시 입력해주세요.");
    }

    public static void printEntrance(String customerName, String restaurantName) {
        System.out.println(String.format("%s 님이 %s에 입장했습니다.", customerName, restaurantName));
    }

    public static void printOrders(Orders orders) {
        System.out.println("주문 목록");
        orders.getOrders().forEach(
                order -> System.out.println(String.format("%s를 %d개 주문하셨습니다.", order.getMenu().getName(), order.getCount()))
        );
    }

    public static void printEating() {
        printSeparator();
        System.out.println("식사중 ...");
        System.out.println("식사중 ...");
        System.out.println("식사중 ...");
    }

    public static void printPay(Orders orders) {
        System.out.println("계산을 진행합니다.");
        System.out.println(String.format("%d원 결제합니다.", orders.getTotalPrice()));
    }

    public static void printChange(String name, int cache) {
        System.out.println(String.format("계산 후 %s님의 전재산은 %d원 입니다.", name, cache));
    }
}
