package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {

        // 사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요.
        // 사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
        // 사용자에게 다음 세 가지 옵션을 제공해야 합니다.
        // - 1. 상품 입력 - 사용자에게 상품명과 가격, 수량을 입력받으세요.
        // - 2. 결제 옵션 - 총 비용을 출력하고 총 비용을 0 으로 초기화하세요.
        // - 3. 프로그램 종료 - "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하세요.
        // - 위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하세요

        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) { // 1: 상품 입력
                input.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명:" + product + " 가격:" + price + " 수량:" + quantity + " 합계:" + price * quantity);

            } else if (option == 2) { // 2: 결제
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;

            } else if (option == 3) { // 3: 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;

            } else { // 그 외
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }

}
