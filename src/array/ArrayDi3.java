package array;

public class ArrayDi3 {

    public static void main(String[] args) {

        // 편리한 초기화
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) { // 행(row)의 길이
            for (int column = 0; column < arr[row].length; column++) { // 열(column)의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

    }

}
