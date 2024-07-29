package array;

public class Array1Ref2 {

    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

        // 배열의 위치를 나타내는 숫자인 인덱스는 1이 아닌 0부터 시작
        // 자바의 변수 데이터 타입 대분류 -> 기본형 vs 참조형

    }

}
