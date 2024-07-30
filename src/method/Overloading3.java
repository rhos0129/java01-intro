package method;

public class Overloading3 {

    public static void main(String[] args) {

        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2, 1.5));

        // 첫번째 메서드를 지워도 뒤의 메서드가 호출된다.
        // 먼저 본인의 타입에 최대한 맞는 메서드를 찾아서 실행하고,
        // 없으면 형 변환 가능한 타입의 메서드를 찾아서 실행한다.

    }

    // 매개변수의 타입이 다른 오버로딩 - 반환값 존재

    public static int add(int a, int b) { //
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }

}
