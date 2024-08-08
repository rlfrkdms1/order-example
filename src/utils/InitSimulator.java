package utils;

import model.Menu;
import model.Owner;
import model.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InitSimulator {

    public static List<Restaurant> init() {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(init_세필());
        restaurants.add(init_성희());
        restaurants.add(init_예진());
        return restaurants;
    }

    private static Restaurant init_세필(){
        Owner 강세필 = new Owner("강세필");
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu("마라샹궈", 16000));
        menus.add(new Menu("마라탕", 10000));
        menus.add(new Menu("꿔바로우", 15000));
        menus.add(new Menu("빙홍차", 2000));
        return new Restaurant("세필네 중국집", createMenus(menus), 강세필);
    }

    private static Restaurant init_성희(){
        Owner 이성희 = new Owner("이성희");
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu("소고기", 20000));
        menus.add(new Menu("된장찌개", 2000));
        menus.add(new Menu("냉면", 7000));
        menus.add(new Menu("콜라", 2000));
        return new Restaurant("성희네 소고기집", createMenus(menus), 이성희);
    }

    private static Restaurant init_예진(){
        Owner 공예진 = new Owner("공예진");
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu("비빔냉면", 10000));
        menus.add(new Menu("물냉면", 10000));
        menus.add(new Menu("만두", 7000));
        menus.add(new Menu("콜라", 2000));
        return new Restaurant("예진네 냉면집", createMenus(menus), 공예진);
    }

    private static Map<String, Menu> createMenus(List<Menu> menus) {
        return menus.stream().collect(Collectors.toMap(Menu::getName, Function.identity()));
    }
}
