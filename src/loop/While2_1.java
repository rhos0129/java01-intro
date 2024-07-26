package loop;

public class While2_1 {

    public static void main(String[] args) {

        // 1부터 하나씩 증가하는 수를 3번 더해라

        int sum = 0;

        sum = sum + 1;
        System.out.println("i=" + 1 + " sum=" + sum);

        sum = sum + 2;
        System.out.println("i=" + 2 + " sum=" + sum);

        sum = sum + 3;
        System.out.println("i=" + 3 + " sum=" + sum);

        // 변경에 유연하지 않다. 1부터가 아니라 10부터라면?

    }

}
