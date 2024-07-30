package method;

public class Method1Ref {

    public static void main(String[] args) {

        //계산1
        int sum1 = add(5, 10); // 메서드 호출
        System.out.println("결과1 출력: " + sum1);

        //계산2
        int sum2 = add(15, 20); // 메서드 호출
        System.out.println("결과2 출력:" + sum2);

    }

    //add 메서드
    public static int add(int a, int b) { // 메서드 선언
        // 메서드 본문
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum; // 메서드 실행의 결과 반환
    }

}
