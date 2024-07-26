package loop;

public class DoWhile2 {

    public static void main(String[] args) {

        // do-while문 : 조건을 만족하지 않아도 최초 한번은 실행

        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);

    }

}
