package ch07_loops;

import java.util.Scanner;

/*
    for 반복문
    : 횟수가 정해져있을 때 사용하는 반복문
    
    형식 :
    for (시작값 ; 종료갑 ; 증감) {
        코드
    }
 */
public class Loop04 {
    public static void main(String[] args) {
//        int sum = 0;
//
//        for (int i = 0; i < 101; i++) {
//            sum += i;
//        }
//
//        System.out.println(sum);
//        System.out.println();


    /*
        1부터 n까지 더하기
     */
        Scanner scan = new Scanner(System.in);

        System.out.print("1부터 n까지의 수를 합하는 장난감입니다. >>> ");
        int n = scan.nextInt();

        int sum2 = 0;

        for (int i = 0; i < n + 1; i++) {
            sum2 += i;
        }

        System.out.println("1~"+ n + "까지의 합은 " + sum2 + "입니다.\n");














    }
}
