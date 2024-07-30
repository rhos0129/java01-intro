package method;

public class Method2 {

    public static void main(String[] args) {

        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return; // 생략가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        // 자바는 반환 타입이 없는 경우에는 자동으로 return을 마지막줄에 넣어준다.
    }

}
