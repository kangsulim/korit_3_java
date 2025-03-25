package ch12_arrays;
/*
    사용해본 Java 클래스
    String
    Scanner
    Arrays
    Integer
    Double
    Comparator
    Random
    --------------

    Math
    지시 사항
    배열 이름은 numbers[]
    
    1. index 가 10개인 빈 배열을 만들고, Math.random()을 사용하여 값 대입
        : 1 이상 10 이하의 int 값으로 만들어서
    2. 1을 끝내면 numbers 배열 안에는 1~10의 element 를 가지게 됩니다.
        1) 배열 정체 출력
        2) 각 요소에 10씩 곱해서 출력
    3. 해당 배열 요소의 합 구하기
    4. 짝수만 출력해서 합 구하기
    5. 오름차순 정렬해서 출력
    6. 내림차순 정렬 출력
 */


import java.util.Arrays;
import java.util.Comparator;

public class Array12 {
    public static void main(String[] args) {
//        // Math 클래스를 사용한 임의의 실수 대입하기
//        double a = Math.random();
//        System.out.println(a);

        Integer[] numbers = new Integer[10];

        // 0. 배열 만들기
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10) + 1;
        }

        // 1. 1) 전체 출력
        System.out.println("배열 전체 출력");
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        // 1. 2) *10

        System.out.println("배열의 요소에 10 곱하기 : ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((numbers[i] * 10) + " ");
        }
        System.out.println();
        System.out.println();

        // 3. 배열의 합
        int sum1 = 0;
        for (Integer number : numbers) {
            sum1 += number;
        }
        System.out.println("배열 요소의 합 : " + sum1);
        System.out.println();

        int sum2 = 0;
        // 4. 짝수만 출력해서 합 구하기
        System.out.print("짝수만 출력하기 : ");
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                sum2 += number;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("짝수의 합 : " + sum2);
        System.out.println();


        // 5. 오름차순 정렬해서 출력
        System.out.println("오름차순 정렬하기 : ");
        Arrays.sort(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();

        // 6. 내림차순 정렬 출력
        System.out.println("내림차순 정렬하기 : ");
        Arrays.sort(numbers, Comparator.reverseOrder());
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();


    }
}
