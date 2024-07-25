package operator;

public class Operator4 {

    public static void main(String[] args) {

        int sum3 = 2 * 2 + 3 * 3; //(2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); //sum3 같다.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 복잡하면 괄호를 명시적으로 사용하는 것이 더 명확하고 이해하기 쉬워 더 유지보수하기 좋다.

    }

}
