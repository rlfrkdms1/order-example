package controller;

import model.Customer;

import model.Order;
import model.Orders;
import model.Restaurant;
import utils.InitSimulator;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static view.InputView.*;
import static view.OutputView.*;

public class RestaurantSimulator {

    private Map<String, Restaurant> restaurants;

    public RestaurantSimulator() {
        this.restaurants = InitSimulator.init().stream()
                .collect(Collectors.toMap(Restaurant::getName, Function.identity()));
    }

    public void run() {
        Customer customer = createCustomer();
        Restaurant restaurant = selectRestaurant();
        entranceRestaurant(customer, restaurant);
        printRestaurant(restaurant);
        Orders orders = createOrders(restaurant);
        customer.order(orders);
        printOrders(orders);
        do {
            printEating();
        } while (!inputEatingStop().equals("N"));
        printPay(orders);
        printChange(customer.getName(), customer.getCash() - orders.getTotalPrice());
    }

    private Orders createOrders(Restaurant restaurant) {
        List<Order> orders = new ArrayList<>();
        while (true) {
            String input = inputOrderMenuOrQuit();
            if (input.equals("exit")) {
                break;
            }
            String menu = input;
            int count = inputOrderCount(menu);
            orders.add(new Order(restaurant.getMenus().get(menu), count));
        }
        return new Orders(orders);
    }

    private void entranceRestaurant(Customer customer, Restaurant restaurant) {
        restaurant.entrance(customer);
        printEntrance(customer.getName(), restaurant.getName());
    }

    private Restaurant selectRestaurant() {
        do {
            printRestaurants(restaurants.entrySet().stream().
                    map(entry -> entry.getValue()).collect(Collectors.toList()));
            String selectedRestaurant = inputRestaurant();
            if (restaurants.containsKey(selectedRestaurant)) {
                return restaurants.get(selectedRestaurant);
            }
            printReselectRestaurant();
        } while (true);
    }

    private Customer createCustomer() {
        String name = inputCustomerName();
        System.out.println(name);
        int cache = inputCustomerCache();
        return new Customer(cache, name);
    }


}
