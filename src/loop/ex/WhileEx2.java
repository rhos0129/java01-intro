package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {

        // 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요.

        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count ++;
        }

    }

}
