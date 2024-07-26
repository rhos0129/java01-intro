package cond;

public class If1 {

    public static void main(String[] args) {

        // if문

        int age = 20; //사용자 나이

        if (age >= 18) { // 참 ->> 실행O
            System.out.println("성인입니다.");
        }

        if (age < 18) { // 거짓 -> 실행X
            System.out.println("미성년자입니다.");
        }

    }

}
