package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Restaurant {

    private String name;
    private Map<String, Menu> menus;
    private List<Customer> customers;
    private Owner owner;

    public Restaurant(String name, Map<String, Menu> menus, Owner owner) {
        this.name = name;
        this.menus = menus;
        this.owner = owner;
        this.customers = new ArrayList<>();
    }

    public void entrance(Customer customer) {
        this.customers.add(customer);
    }

    public String getName() {
        return name;
    }

    public Map<String, Menu> getMenus() {
        return menus;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Owner getOwner() {
        return owner;
    }
}
