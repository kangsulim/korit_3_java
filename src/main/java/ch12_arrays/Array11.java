package ch12_arrays;
/*
    배열의 출력

    Arrays 클래스를 사용하고, 적정 메서드 .toString(베열명)을 사용하면
    배열 전체를 출력할 수 있습니다.

    여기서 클래스명.메서드명()이라는 점에 주목할 필요가 있습니다.
    scan.nextLine()과는 다릅니다.
    그리고 또한 toString()이라는 베서드도 속 사용합니다.

    여기서 기억해야할 점은 동일한 메서드명이라고 하더라고
    어떤 클래스에 종속되어 있는가에 따라 다은 결과값을 가질 수 있다는 점입니다.
    
    ex) random.nextInt(); -> int 범위 내에 있는 임의의 정수 반환
    ex) scan.nextInt(); -> 콘솔에서 int 값을 받아 대입
    
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scan = new Scanner(System.in);
//
//        int num1 = random.nextInt();
//        System.out.println(num1);
//
//        int num2 = scan.nextInt();
//        System.out.println(num2);

        // nums 1~10 대입

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            int index = i + 1;
            nums[i] = index;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(nums));

        Integer[] numbers = {4,7,1,9,6,2,5,8,3,0};
        System.out.println("정렬 전 배열 : " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 오름차순 정렬
        Arrays.sort(numbers);

        // 대부분의 경우에는 메서드를 사용하고 나면
        // 그 결과값을 변수에 대입해왔지만 .sort() 메서드는
        // 순서 자체를 바꿔버림
        System.out.println("정렬 후 배열 : " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 내림차순 배열

        System.out.println();
        Arrays.sort(numbers, Comparator.reverseOrder());
        // 오름차순 시에 사용했던 sort()와 마찬가지로 배열 자체를 다 바꿉니다.
        // .sort() 내부의 argument 가 두 개라는 점에서
        // 오버로딩 되었다는 점을 추측 가능하다.
        // Comparator.reverseOrder() 메서드를 사용하기 위해서
        // int[] -> Integer[]로 바꿨는데, 기본자료형 int 를 String 처럼
        // 클래스로 바꿨다고 일단은 생각하면 된다.
    }
}
