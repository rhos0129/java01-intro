package loop;

public class For2 {

    public static void main(String[] args) {

        // i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라

        int sum = 0;
        int endNum = 3;

        //sum=1+2+3
        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }

        // While2_3와 비교하면 for문이 더 깔끔하다.
        // for문 -> 변수 초기화, 조건식, 증감식이 모두 한 줄에 있다.
        // while문 -> 해당 코드가 모두 분산되어 있다.

        // 스코프 관점
        // - 변수 i 의 스코프가 for문 안으로 한정


    }

}
