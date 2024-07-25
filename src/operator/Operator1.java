package operator;

public class Operator1 {

    public static void main(String[] args) {

        // 산술연산자

        //변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈 - 숫자는 0으로 나눌 수 없다. 오류 발생
        int div = a / b;
        System.out.println("a / b = " + div);

        // 나머지 - 실무와 알고리즘 모두 종종 사용하므로 기억해두자
        int mod = a % b;
        System.out.println("a % b = " + mod);

    }

}
