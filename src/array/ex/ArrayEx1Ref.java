package array.ex;

public class ArrayEx1Ref {

    public static void main(String[] args) {

        // 배열을 사용해서 개선하자.

        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

    }

}