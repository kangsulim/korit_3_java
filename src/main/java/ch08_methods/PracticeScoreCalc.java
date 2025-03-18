package ch08_methods;

import java.util.Scanner;

public class PracticeScoreCalc {
    public static double[] scoreCalc(int numOfSubs) {
        Scanner scan = new Scanner(System.in);
        double[] score;
        score = new double[10];

        for (int i = 0; i < numOfSubs; i++) {
            System.out.print((i+1) + "과목의 점수를 입력하시오 >>> ");
            score[i] = scan.nextDouble();
        }



        return score;
    }

    public static double scoreTotal(int numOfSubs, double[] score) {
        double sum = 0.0;

        for (int i = 0; i < numOfSubs; i++) {
            sum += score[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfSubs;
        double[] score;
        score = new double[10];

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scan.nextInt();

        System.out.println("평균은 " + scoreCalc(numOfSubs) + "점입니다");
    }
}
