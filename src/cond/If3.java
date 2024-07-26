package cond;

public class If3 {

    public static void main(String[] args) {

        int age = 14;

        if (age <= 7) { //~7: 미취학
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {  //8~13: 초등학생
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) { //14~16: 중학생
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) { //17~19: 고등학생
            System.out.println("고등학생");
        }
        if (age >= 20) { //20~: 성인
            System.out.println("성인");
        }

        // 단점
        // 1. 불필요한 조건 검사
        // 이미 조건을 만족해도 불필요한 다음 조건을 계속 검사
        // 2. 코드 효율성
        // 나이가 8살인 초등학생이라면 미취학을 체크하는 조건인 age <= 7 을 통해 나이가 이미 8살이 넘는 다는 사실을 알 수 있다.
        // 그런데 바로 다음에 있는 초등학생을 체크하는 조건에서 age >= 8 && age <= 13 라는 2가지 조건을 모두 수행한다.
        // 결과적으로 조건을 중복 체크한 것이다.

    }

}
