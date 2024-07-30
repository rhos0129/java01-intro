package method;

public class MethodValue2 {

    public static void main(String[] args) {

        int number = 5; // 메서드의 매개변수와 이름이 같은 변수
        System.out.println("1. changeNumber 호출 전, number: " + number); // 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); // 10이 아닌 5

        // 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수
        // main() 의 number != changeNumber() 의 number

    }

    public static void changeNumber(int number) { //
        System.out.println("2. changeNumber 변경 전, number: " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number); // 10
    }

}
