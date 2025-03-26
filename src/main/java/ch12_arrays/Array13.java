package ch12_arrays;

import java.util.Arrays;

/*
    다차원 배열 (Multy Demensional Array)

    : 다차원 배열은 2차원 이상의 배열을 의미하지만,
    개발환경 상 2차원 배열 이상을 다루는 경우는 드물다.
    그러므로 학습은 2차원 배열 위주로 한다.

    형식 :
    int[][] arr01 = new in[size][size];     - 선언 방식 1
    int[][] arr02 = new in[size][];         - 선언 방식 2
    int[][] arr03 = { {1,2}, {3,4}, {5,6}}; - 선언 방식 3

    2차원 배열 선언 시, 열의 크기는 정하지 않아도 되지만,
    행의 크기는 항상 지정해야 함.   -> 선언 방식 2
                 1열 2열  (column)
                  ↓  ↓
                { 1, 2 }, → 가로줄 : 행   1행 (row)
                { 3, 4 },               2행
                { 5, 6 }                3행

 */
public class Array13 {
    public static void main(String[] args) {
        int[][] arr01 = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };
        // 5를 가져오고 싶다
        System.out.println(arr01[2][0]);

        System.out.println(arr01);              // [[I@36baf30c
        System.out.println(arr01[1]);           // [I@7a81197d
        System.out.println(Arrays.toString(arr01));
        //[[I@5ca881b5, [I@7a81197d, [I@24d46ca6]

        // 2중 for 문을 통한 2차 배열의 element 값 추출

        for (int i = 0; i < arr01.length; i++) {
            for (int j = 0; j < arr01[i].length; j++) {
                System.out.print(arr01[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // 향상된 for 문을 통한 구현

        for (int[] element : arr01) {
            for (int number : element) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }

        int[] arr02 = { 9,8,7,6,5};
    }
}
