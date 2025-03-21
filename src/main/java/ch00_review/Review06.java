package ch00_review;

import java.util.Scanner;

public class Review06 {
    // method 정의 영역
    /*
        1. 총합을 내는 메서드 ->
            1) 매개변수 score1, score2
            2) return type double
            호출 방식
            System.out.println(review06.addScores(4.5. 3.0));
            실행 예
            7.5
     */

    double AddScores(double score1, double score2) {

        double sum = score1 + score2;

        return sum;
    }

    /*
        2. 평균을 내는 메서드 구현
     */

    double calculateAvg(double sum, int Subs) {

        double avg; // 지역변수 선언

        avg = sum / Subs;   // 지역변수 초기화

        return avg;
    }


    public static void main(String[] args) {
        // method 호출 영역

        Review06 review06 = new Review06();

//        double sum = review06.AddScores(4.5, 3.0);
//        int Subs = 2;
//
//        System.out.println(sum);
//        System.out.println();
//
//        System.out.println(review06.calculateAvg(sum, Subs));

        /*
            main 단계에서 반복문과 결합하여
            원하는 과목의 개수의 점수 합과 평균을 구할 수 있도록 작성할 것
         */

        Scanner scan = new Scanner(System.in);

        double totalScore = 0, avgScore = 0;
        int subs = 0;

        System.out.print("몇 개 과목을 입력하시겠습니까? >>> ");
        subs = scan.nextInt();

        for (int i = 0; i < subs; i++) {
            System.out.print((i + 1) + "번째 과목의 점수를 입력하시오 >>> ");
            totalScore += scan.nextDouble();
        }

        avgScore = review06.calculateAvg(totalScore, subs);

        System.out.println("당신의 평균 학점은 " + avgScore + "점입니다.");
    }
}
