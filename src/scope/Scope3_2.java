package scope;

public class Scope3_2 {

    public static void main(String[] args) {

        int m = 10;

        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }

        System.out.println("m = " + m);

        // if문 내에서 선언된 temp
        // - 효율적인 메모리 사용 : 불필요할 때 메모리 제거된다.
        // - 유지보수성 증가 : if문 내에서만 신경쓰면 된다.

    }

}
