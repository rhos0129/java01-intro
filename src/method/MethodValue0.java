package method;

public class MethodValue0 {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = num1; // num1에 있는 값 5를 복사해서 num2에 넣는 것
        num2 = 10;

        System.out.println("num1 = " + num1); // 5
        System.out.println("num2 = " + num2); // 10

    }
}

