package operator;

public class Operator3 {

    public static void main(String[] args) {

        int sum1 = 1 + 2 * 3; // 곱셈이 먼저
        int sum2 = (1 + 2) * 3; // 괄호가 먼저
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

    }

}
