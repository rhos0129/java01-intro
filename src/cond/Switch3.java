package cond;

public class Switch3 {

    public static void main(String[] args) {

        // grade 1 :1000, 2: 2000, 3 : 3000, 나머지 : 500
        // break가 없다면?

        int grade = 1;

        int coupon;
        switch (2) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);

    }

}
