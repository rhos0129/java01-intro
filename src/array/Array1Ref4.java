package array;

public class Array1Ref4 {

    public static void main(String[] args) {

        // 배열의 편리한 초기화 : 배열 변수 선언, 배열 생성, 배열 초기화를 한줄로 간단하게
//        int[] students = new int[]{90, 80, 70, 60, 50};
        int[] students = {90, 80, 70, 60, 50};

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

    }

}
