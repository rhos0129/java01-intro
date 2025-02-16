package cond.ex;

public class GradeSwitchEx {

    public static void main(String[] args) {

        // String grade 라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자. (switch문 활용)
        // - "A": "탁월한 성과입니다!"
        // - "B": "좋은 성과입니다!"
        // - "C": "준수한 성과입니다!"
        // - "D": "향상이 필요합니다."
        // - "F": "불합격입니다."
        // - 나머지: "잘못된 학점입니다."

        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 성과입니다!");
                break;
            case "F":
                System.out.println("불합격입니다!");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}
