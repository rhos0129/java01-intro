package operator;

public class Operator2 {

    public static void main(String[] args) {

        // 문자열과 문자열 더하기
        // 문자열에 + 연산자를 사용하면 두 문자열을 연결할 수 있다.

        // 1
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);



        // 문자열과 숫자 더하기
        // 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다.

        // 1
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

    }

}
