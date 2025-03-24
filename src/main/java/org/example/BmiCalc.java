package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCalc {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");
    private double height, weight, bmi;
    private String status;

    public BmiCalc() {
    }

    public double getBmi() {
        System.out.println("1번 방식의 시작입니다.\n");
        System.out.print("키(cm)를 입력하시오 >>> ");
        height = scan.nextDouble() / 100.0;

        System.out.print("몸무게(kg)를 입력하시오 >>> ");
        weight = scan.nextDouble();

        bmi = weight / (height * height);

        return bmi;
    }

    public void getResult(double bmi) {
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
        System.out.println("\n1번 방식의 끝입니다.");
    }

    public void getBmiResult() {
        System.out.println("2번 방식의 시작입니다.\n");
        System.out.print("키(cm)를 입력하시오 >>> ");
        height = scan.nextDouble() / 100.0;

        System.out.print("몸무게(kg)를 입력하시오 >>> ");
        weight = scan.nextDouble();

        bmi = weight / (height * height);

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
        System.out.println("\n2번 방식의 끝입니다.");
    }
}
