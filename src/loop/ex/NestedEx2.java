package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {

        // 중첩 for문을 사용해서 피라미드를 출력해라.

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // 라인을 넘기지 않고 출력
            }
            System.out.println();
        }

    }

}
