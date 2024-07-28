package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        // 사용자 입력을 위한 Scanner 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt(); // 입력을 int 형으로 가져온다.
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble(); // 입력을 double 형으로 가져온다.
        System.out.println("입력한 실수: " + doubleValue);

        // 다른 타입 입력시 오류 발행

    }

}
