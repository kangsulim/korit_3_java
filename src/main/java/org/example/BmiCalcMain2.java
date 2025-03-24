package org.example;

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
public class BmiCalcMain2 {
    public static void main(String[] args) {
        double bmi;

        BmiCalc bmiCalc1 = new BmiCalc();
        BmiCalc bmiCalc2 = new BmiCalc();

        bmi = bmiCalc1.getBmi();    // 여러 개의 메서드에 기능을 분할함
        bmiCalc1.getResult(bmi);

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        bmiCalc2.getBmiResult();    // 하나의 메서드에 기능을 집중함
    }
}