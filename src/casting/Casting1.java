package casting;

public class Casting1 {

    public static void main(String[] args) {

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue);

        // 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.

    }

}
