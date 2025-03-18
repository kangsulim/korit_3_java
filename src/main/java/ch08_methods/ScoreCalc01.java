package ch08_methods;

import java.util.Scanner;

public class ScoreCalc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] score;
        score = new double[10];
        double sum = 0.0;
        double avg = 0.0;
        int numOfSubs = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scan.nextInt();

        for (int i = 0; i < numOfSubs; i++) {
            System.out.print((i+1) + "과목의 점수를 입력하시오 >>> ");
            score[i] = scan.nextDouble();

            sum += score[i];

            System.out.println(score[i]);
            System.out.println(sum);
        }

        avg = sum / numOfSubs;

        System.out.println("총합은 " + sum + "점이며, 평균은 " + avg + "점입니다.");
    }
}
