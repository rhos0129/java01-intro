package array;

public class ArrayDi4 {

    public static void main(String[] args) {

        int[][] arr = new int[10][10];

        // 배열의 크기와 상관없이 배열에 순서대로 1씩 증가하는 값을 입력
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; // 후위 증감 연산자
            }
        }

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) { // 행(row)의 길이
            for (int column = 0; column < arr[row].length; column++) { // 열(column)의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

    }

}
