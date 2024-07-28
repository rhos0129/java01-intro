package scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {

        // 변수 a 의 값과 변수 b 의 값을 서로 바꾸어라

        int a = 10;
        int b = 20;
        int temp; //a의 값 10

        temp = a; //10
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}