package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
    BMI 계산기를 작성하시오.

    1. 사용자에게 키(cm)와 몸무게(kg)를 입력 받으시오.
    2. BMI 지수를 산출하시오
        몸무게(kg) / 키(cm)^2
    3. 구분
        18.5 미만 저체중
        23 미만 정상
        25 미만 과체중
        25 이상 비만
    4. 실행 예
        키를 입력하시오 >>>
        몸무게를 입력하시오 >>>
        당신의 BMI는 xx.xxxxx이며, ㅁㅁ입니다.
 */
public class BmiCalcMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double height, weight, bmi;
        String status = "";

        System.out.print("키(cm)를 입력하시오 >>> ");
        height = scan.nextDouble() / 100.0;

        if (height <= 0) {
            System.out.println("잘못된 입력입니다.");
            System.out.println("시스템을 종료합니다.");
        }

        System.out.print("몸무게(kg)를 입력하시오 >>> ");
        weight = scan.nextDouble();

        bmi = weight / (height * height);

        DecimalFormat df = new DecimalFormat("#.##");

        if (bmi > 0){
            if (bmi < 18.5) {
                status = "저체중";
            } else if (bmi < 23) {
                status = "정상 체중";
            } else if (bmi < 25) {
                status = "과체중";
            } else {
                status = "비만";
            }
            System.out.println("당신의 BMI 지수는 " + df.format(bmi) + "이며, " + status + "입니다.");
        } else {
            System.out.println("뭔가 잘못되었습니다.");
        }



        scan.close();
    }
}