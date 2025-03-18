package ch09_classes;

import java.util.Scanner;

public class ScoreCalcMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ScoreCalc scoreCalc = new ScoreCalc();

        boolean endOfCalc = false;
        int numOfSubs = 1;
        double score = 0.0;
        double totalScore = 0.0;
        double avgScore = 0.0;

        System.out.println("당신의 이번 학기 총점과 평균 점수를 계산하는 프로그램입니다.");
        System.out.println();

        while (!endOfCalc) {
            System.out.print(numOfSubs + "과목의 점수를 입력하시오(종료하려면 -1을 입력하시오) >>> ");
            score = scan.nextDouble();

            if (score == -1) {
                break;
            }

            totalScore = scoreCalc.addScore(totalScore, score);
            avgScore = scoreCalc.calculateAvg(totalScore, numOfSubs);

            System.out.println("=======총점과 평균=======");
            System.out.println("   총점 : " + totalScore + "\n   평균 : " + avgScore);
            System.out.println("=======================");

            numOfSubs++;
        }
        System.out.println();

        System.out.println("=======================");
        System.out.printf("   %s개 과목의 총점과 평균\n", (numOfSubs-1));
        System.out.println("   총점 : " + totalScore + "\n   평균 : " + avgScore);
        System.out.println("=======================");

        scan.close();
    }
}
