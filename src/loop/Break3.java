package loop;

public class Break3 {

    public static void main(String[] args) {

        // 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?

        int sum = 0;

        for (int i = 1; ; i++) { // 조건식만 생략
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }

        // for문이 없이 while문으로 모든 반복을 다룰 수 있지만
        // 반복 횟수가 정해진 경우에는 for문을 사용하는 것이 구조적으로 더 깔끔하고 유지보수 하기 좋다.

    }

}
