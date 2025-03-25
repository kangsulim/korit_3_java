package ch12_arrays;
/*
    String[] scores = {"A", "B", "C", "D", "F"}
    를 선언하고 반복문을 작성하여 +를 달아줘라
 */

public class Array05 {

    public static void main(String[] args) {
//        String[] scores = {"A", "B", "C", "D", "F"};
//
//        for (int i = 0; i < scores.length; i++) {
//            scores[i] += "+";
//        }
//
//        System.out.print("점수 : ");
//
//        for (String score : scores) {
//            System.out.print(score + " ");
//        }

//        int[] scores2 = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 1};
//        int sum = 0, cnt = 0;
//        double avg;
//        // 총합, 평균 계산하기
//        for (int score : scores2) {
//            sum += score;
//            cnt++;
//        }
//        avg = (double) sum / cnt;
//
//        System.out.println("총점 : " + sum);
//        System.out.println("평균 : " + avg);

        int[] scores3 = {88, 94, 77, 100, 64, 32, 95, 82, 59};
        /*
            합, 평균

            등급 매기기
            90 A
            80 B
            70 C
            60 D
            59 F

            각 등급이 몇 명인지

            실행 예

            총합 : 점
            평균 : 점
            A 학생 수 : 명
         */

        int cntA = 0, cntB = 0, cntC = 0,
            cntD = 0, cntF = 0, sum = 0;
        double avg = 0;

        for (int i = 0; i < scores3.length; i++) {
            sum += scores3[i];
            if (scores3[i] >= 90) {
                cntA++;
            } else if (scores3[i] >= 80) {
                cntB++;
            } else if (scores3[i] >= 70) {
                cntC++;
            } else if (scores3[i] >= 60) {
                cntD++;
            } else {
                cntF++;
            }
        }

        avg = (double) sum / scores3.length;

        System.out.println("총합 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
        System.out.println("A 학생 수 : " + cntA);
        System.out.println("B 학생 수 : " + cntB);
        System.out.println("C 학생 수 : " + cntC);
        System.out.println("D 학생 수 : " + cntD);
        System.out.println("F 학생 수 : " + cntF);
    }
}
