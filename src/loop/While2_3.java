package loop;

public class While2_3 {

    public static void main(String[] args) {

        //  i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라

        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }

        // 원하는 횟수 만큼 같은 코드를 반복 실행할 수 있다.

        // 스코프 관점
        // - 변수 i 의 스코프가 main() 메서드 전체



    }

}
