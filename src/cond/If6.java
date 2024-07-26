package cond;

public class If6 {

    public static void main(String[] args) {

        // 한 사용자가 동시에 여러 할인을 받을 수 없다
        // 서로 연관된 조건이면 if문에 else if 를 함께  사용

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

    }

}
