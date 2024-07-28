package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {

        // 사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요.
        // 사용자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 10\n -> 10만 읽고 \n은 남는다.
            input.nextLine(); // 남은 \n를 버려준다.. 주석처리하면 두번째 반복부터 프로그램이 이상해짐

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }

    }

}
