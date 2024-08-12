package view;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in, "EUC-KR");

    public static String inputCustomerName() {
        System.out.println("이름을 작성해주세요.");
        return scanner.next();
    }

    public static int inputCustomerCache() {
        System.out.println("가지고 있는 돈을 작성해주세요.");
        return scanner.nextInt();
    }

    public static String inputRestaurant() {
        System.out.println("방문할 식당 이름을 작성해주세요.");
        return scanner.nextLine();
    }

    public static String inputOrderMenuOrQuit() {
        System.out.println("주문을 그만하고 싶다면 exit을 작성해주세요.");
        System.out.println("주문할 메뉴명을 작성해주세요.");
        return scanner.nextLine();
    }

    public static int inputOrderCount(String menu) {
        System.out.println(String.format("%s 메뉴를 몇개 시킬지 작성해주세요.", menu));
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputEatingStop() {
        System.out.println("식사를 그만하고 싶다면 N, 식사를 계속하고 싶다면 Y를 작성해주세요.");
        return scanner.nextLine();
    }

}
