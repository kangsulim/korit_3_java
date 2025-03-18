package ch06_condition;
/*
    if else 문 :
    조건식을 여러개 가지는 if문
    if(조건식1) {
    } else if(조건식2) {
    } else if(조건식3) {
    } else {
    }
 */

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        // 2의 추가 부분을 통해 코드 효율화
        String rating = "";


        System.out.println("회원 포인트를 입력하시오 >>> ");
        int point = scan.nextInt();

//      #1
//        if(point > 80) {
//            System.out.println("회원 등급 : VIP");
//        } else if(point > 60) {
//            System.out.println("회원 등급 : GOLD");
//        } else if(point > 40) {
//            System.out.println("회원 등급 : SILVER");
//        } else if(point > 20) {
//            System.out.println("회원 등급 : BRONZE");
//        } else {
//            System.out.println("회원 등급 : NORMAL");
//        }

//      #2
//        if(point > VIP_POINT) {
//            System.out.println("회원 등급 : VIP");
//        } else if(point > GOLD_POINT) {
//            System.out.println("회원 등급 : GOLD");
//        } else if(point > SILVER_POINT) {
//            System.out.println("회원 등급 : SILVER");
//        } else if(point > BRONZE_POINT) {
//            System.out.println("회원 등급 : BRONZE");
//        } else {
//            System.out.println("회원 등급 : NORMAL");
//        }

        if(point > VIP_POINT) {
            rating = "VIP";
        } else if(point > GOLD_POINT) {
            rating = "GOLD";
        } else if(point > SILVER_POINT) {
            rating = "SILVER";
        } else if(point > BRONZE_POINT) {
            rating = "BRONZE";
        } else if (point <= BRONZE_POINT) {
            rating = "NORMAL";
        }
        System.out.println("당신의 등급은 " + rating + "입니다.");

        scan.close();
    }
}
