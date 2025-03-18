package ch06_condition;

import java.util.Scanner;

/*
    score의 범위는 0~100 / 이외는 grade = X

    changedScore = 9~10, grade = A
    changedScore = 8, grade = B
    changedScore = 7, grade = B
    changedScore = 6, grade = B
    changedScore = 0~5, grade = B

    실행
    점수를 입력하세요 >>> 100
    점수는 100점이고, 학점은 A입니다.
 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score;
        int changedScore;
        String grade;
        final int MAX_SCORE = 100;
        final int MIN_SCORE = 0;
        int A = 9;
        int B = 8;
        int C = 7;
        int D = 6;
        int F = MIN_SCORE;

        System.out.print("점수를 입력하세요 >>> ");
        score = scan.nextInt();


        if (score <= MAX_SCORE && score >= MIN_SCORE) {
            changedScore = score / 10;

//            System.out.println(changedScore);
            switch(changedScore) {
                case 6:
                    grade = "D";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 9, 10:
                    grade = "A";
                    break;
                default:
                    grade = "F";
                    break;
            }
        } else {
            grade = "X";
        }

        System.out.println("점수는 " + score + "점이고 학점은 " + grade + "입니다.\n");
    }
}
