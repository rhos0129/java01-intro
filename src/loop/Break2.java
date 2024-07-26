package loop;

public class Break2 {

    public static void main(String[] args) {

        // 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?

        int sum = 0;
        int i = 1;

        for ( ; ; ) { // 초기식, 조건식, 증감식 모두 생략
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }

        // 변수 선언과 증감식이 분산되어 있다.
        // 어떤 값이 반복에 사용되는 증가 값인지 즉시 확인하기 어렵다.

    }

}
