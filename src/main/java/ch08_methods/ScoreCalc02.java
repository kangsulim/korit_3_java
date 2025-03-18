package ch08_methods;

import java.util.Scanner;

public class ScoreCalc02 {
//    public static double addScores(double score1, double score2) {
//        return score1 + score2;
//    }
//
//    public static double addScores(double score1, double score2, double score3) {
//        return score1 + score2 + score3;
//    }
//
//    public static double addScores(double score1, double score2, double score3, double score4) {
//        return score1 + score2 + score3 + score4;
//    }
//
//    public static double addScores(double score1, double score2, double score3, double score4, double score5) {
//        return score1 + score2 + score3 + score4 + score5;
//    }
//
//    public static double addScores(double score1, double score2, double score3, double score4, double score5, double score6) {
//        return score1 + score2 + score3 + score4 + score5 + score6;
//    }

    public static double addSubject(double totalScore, double addedScore) {
        return totalScore + addedScore;
    }

    public static double calculateAvg(double totalScore, int numOfSubs) {
        return totalScore / numOfSubs;
    }

    public static void main(String[] args) {
//        double sum = addScores(100, 95);
//        System.out.println(sum);

//        System.out.println(addSubject(4.5,3.5));
//        System.out.println(addSubject(4.5,3.5));

        Scanner scan = new Scanner(System.in);

        boolean endOfCalc = false;
        int numOfSubs = 1;
        double score = 0.0;
        double totalScore = 0.0;
        double avgScore = 0.0;

        System.out.println("당신의 이번 학기 총점과 평균 점수를 계산하는 프로그램입니다.");
        System.out.println("계속하려면 양수를, 종료하려면 음수를 입력하시오");
        System.out.println();

        while (!endOfCalc) {
            System.out.print(numOfSubs + "과목의 점수를 입력하시오(종료하려면 -1을 입력하시오) >>> ");
            score = scan.nextDouble();

            if (score == -1) {    // 왜 종료나 X가 아니라 -1을 입력했을 때 종료되도록 작성해야할까?
                break;
                // endOfCalc = true;
            }

            totalScore = addSubject(totalScore, score);
            avgScore = calculateAvg(totalScore, numOfSubs);

            System.out.println("=======총점과 평균=======");
            System.out.println("총점 : " + totalScore + "\n평균 : " + avgScore);
            System.out.println("=======================");

            numOfSubs++;
        }

        System.out.println("=======총점과 평균=======");
        System.out.println("총점 : " + totalScore + "\n평균 : " + avgScore);
        System.out.println("=======================");

        scan.close();
    }
}
