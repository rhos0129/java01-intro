package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {

        // 메서드를 사용하도록 리펙토링해보자

        printMessage("Hello, world!", 3);
        printMessage("java", 5);
        printMessage("hi", 7);

    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

}