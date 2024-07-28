package scope;

public class Scope3_1 {

    public static void main(String[] args) {

        int m = 10;
        int temp = 0;

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);

        }

        System.out.println("m = " + m);

        // temp는 if문 내에만 필요한 임시 변수
        // - 비효율적인 메모리 사용 : 필요없어도 메모리 공간이 유지된다.
        // - 유지보수성 감소 : main 어디서나 접근가능하므로 이후에도 신경써야한다.

    }

}
