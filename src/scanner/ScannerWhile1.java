package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {

        // 사용자가 입력한 문자열을 그대로 출력
        // exit 라는 문자가 입력되면 프로그램 종료
        // 프로그램은 반복해서 실행


        Scanner scanner = new Scanner(System.in);

        while (true) { // 무한반복
            System.out.print("문자열을 입력하세요(exit: 종료):");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break; // 반복문 종료
            }

            System.out.println("입력한 문자열: " + str);
        }

    }

}
