package cond;

public class CondOp2 {

    public static void main(String[] args) {

        int age = 18;

        // 단순히 참과 거짓에 따라서 특정 값을 구하는 경우 삼항연산자 사용 가능
        // (조건) ? 참_표현식 : 거짓_표현식
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age = " + age + " status = " + status);

    }

}
