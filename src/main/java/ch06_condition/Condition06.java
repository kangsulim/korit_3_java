package ch06_condition;

import java.util.Scanner;

/*
    중첩 if문
        if문 내에 if 문이 연속적으로 사용된 형태
 */
public class Condition06 {
    public static void main(String[] args) {
        /*
            사용자에겍 score를 입력 받아 다음과 같은 조건을 만족하도록 작성하시오.

            score가 0보다 작거나 100 초과히면 grade는 X
            score 90~100, grade = A
            score 80~89, grade = B
            score 70~79, grade = C
            score 60~69, grade = D
            score 0~59, grade = F
         */

        Scanner scan = new Scanner(System.in);

        int score = 0;
        int A = 90;
        int B = 80;
        int C = 70;
        int D = 60;
        String grade = "";
        final int MAX_SCORE = 100;
        final int MIN_SCORE = 0;

        System.out.print("Input your score : ");
        score = scan.nextInt();

        // #1 일반적인 if문
        if (score > MAX_SCORE) {
            grade = "X";
        } else if (score > A) {
            grade = "A";
        } else if (score > B) {
            grade = "B";
        } else if (score > C) {
            grade = "C";
        } else if (score > D) {
            grade = "D";
        } else if (score >= MIN_SCORE) {
            grade = "F";
        } else {
            grade = "X";
        }

        System.out.println("입력한 점수는 " + score + "이며 학점은 " + grade + "입니다.\n");

        // #2 중첩 if문
        if (score <= MAX_SCORE) {
            if (score >= MIN_SCORE) {
                if (score >= A) {
                    grade = "A";
                } else if (score >= B) {
                    grade = "B";
                } else if (score >= C) {
                    grade = "C";
                } else if (score >= D) {
                    grade = "D";
                } else {
                    grade = "F";
                }
            } else {
                grade = "X";
            }
        } else {
            grade = "X";
        }

        System.out.println("입력한 점수는 " + score + "이며 학점은 " + grade + "입니다.\n");

        // #3 논리 연산자를 사용한 if문
        if (score <= MAX_SCORE && score >= MIN_SCORE) {
            if (score >= A) {
                grade = "A";
            } else if (score >= B) {
                grade = "B";
            } else if (score >= C) {
                grade = "C";
            } else if (score >= D) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {
            grade = "X";
        }

        System.out.println("입력한 점수는 " + score + "이며 학점은 " + grade + "입니다.\n");

        scan.close();
    }
}
