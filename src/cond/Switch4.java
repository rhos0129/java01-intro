package cond;

public class Switch4 {

    public static void main(String[] args) {

        // grade 1 :1000, 2: 2000, 3 : 3000, 나머지 : 500
        // 자바 14 새로운 switch문

        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default ->  500;
        };

        System.out.println("발급받은 쿠폰 " + coupon);

    }

}
