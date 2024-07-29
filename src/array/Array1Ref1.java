package array;

public class Array1Ref1 {

    public static void main(String[] args) {

        int[] students; // 1. 배열 변수 선언
        students = new int[5]; // 2. 배열 생성
//        students = x001; // 3. 배열 참조값 보관 (최종결과, 내부적으로 알아서 실행)

        System.out.println(students); // [I@10f87f48 출력 (참조값)

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);

    }

}
