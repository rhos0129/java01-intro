package loop;

public class While2_2 {

    public static void main(String[] args) {

        // i부터 하나씩 증가하는 수를 3번 더해라

        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);

        // 아직 부족하다. 3번이 아니라 endNum번 더한다면?

    }

}
