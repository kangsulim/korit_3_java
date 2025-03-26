package ch12_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int number = 0;

        // 배열에 1부터 100까지 대입하기

        System.out.println("일반 for 문으로 출력");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("{  ");
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = ++number;
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("}");
        }

        System.out.println("\n향상된 for 문으로 출력");
        for (int[] element : nums) {
            System.out.print("{  ");
            for (int num : element) {
                System.out.print(num + "\t");
            }
            System.out.println("}");
        }

        // 2차 배열의 출력
        // Arrays.toString()이 안 통한다
        System.out.println(Arrays.deepToString(nums));
    }
}
