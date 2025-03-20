package ch00_review;

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {
        /*
            조건문
            1. if (조건식1) {
                    실행문1
               } else if (조건식2) {
                    실행문2
               } else {
                    실행문3
               }
               조건식 : true / false 를 판별 가능한 식
               1) 조건식1이 true 이면 -> {} 내의 실행문을 동작
               2) 조건식1이 false 이고
                  조건식2가 true 이면 -> {} 내의 실행문을 동작
               3) 조건식1이 false 이고
                  조건식2도 false 이면 ->else {} 내의 실행문을 동작

            롤러코스터 탑승 제한
            7세 이상
            110cm 이상
         */
        Scanner scan = new Scanner(System.in);

        int age = 0;
        double height = 0;

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");

        System.out.println("롤러코스터 탑승 가능 여부를 확인하는 절차입니다.");

        System.out.print("나이를 입력하시오 >>> ");
        age = scan.nextInt();
        System.out.print("키를 입력하시오 >>> ");
        height = scan.nextDouble();

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
        // 나이 우선 검증
        if (age >= 7){
            System.out.println("규정 나이 이상입니다.");
            if (height >= 110) {
                System.out.println("규정 신장 이상입니다.\n롤러코스터 탑승이 가능합니다.");
            } else {
                System.out.println("하지만 규정 신장 미만입니다.\n롤러코스터 탑승이 불가능합니다.");
            }
        } else {
            System.out.println("규정 나이 미만입니다.\n롤러코스터 탑승이 불가능합니다.");
        }
        System.out.println("이용해주셔서 감사합니다\n");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");

        System.out.println("롤러코스터 탑승 가능 여부를 확인하는 절차입니다.");

        System.out.print("나이를 입력하시오 >>> ");
        age = scan.nextInt();
        System.out.print("키를 입력하시오 >>> ");
        height = scan.nextDouble();
        // 키 우선 검증
        if(height >= 110){
            System.out.println("규정 신장 이상입니다.");
            if (age >= 7) {
                System.out.println("규정 연령 이상입니다.\n롤러코스터 탑승이 가능합니다.");
            } else {
                System.out.println("하지만 규정 연령 미만입니다.\n롤러코스터 탑승이 불가능합니다.");
            }
        } else {
            System.out.println("규정 신장 미만입니다.\n롤러코스터 탑승이 불가능합니다.");
        }
        System.out.println("이용해주셔서 감사합니다.\n");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");

        System.out.println("롤러코스터 탑승 가능 여부를 확인하는 절차입니다.");

        System.out.print("나이를 입력하시오 >>> ");
        age = scan.nextInt();
        System.out.print("키를 입력하시오 >>> ");
        height = scan.nextDouble();

        // 나이, 키 동시 검증
        if (age >= 7 && height >= 110) {
            System.out.println("롤러코스터 탑승이 가능합니다.");
        } else {
            System.out.println("롤러코스터 탑승이 불가능합니다.");
        }
        System.out.println("이용해주셔서 감사합니다.\n");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
    }
}

