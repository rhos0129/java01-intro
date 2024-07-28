package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {

        // 사용자로부터 음식의 이름(foodName), 가격(foodPrice), 그리고 수량(foodQuantity)을 입력받아,
        // 주문한 음식의 총 가격(totalPrice)을 계산하고 출력하는 프로그램을 작성하세요.

        Scanner input = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = input.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = input.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");

    }

}
