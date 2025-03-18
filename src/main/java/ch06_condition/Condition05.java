package ch06_condition;
/*
    과제 :

    윤년 계산기 작성

    윤년(leap year)
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year;
        boolean isLeap;

        System.out.print("연도를 입력하시오 >>> ");
        year = scan.nextInt();

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        String comment = "";

        if (isLeap) {
            comment = " is a leap year!";
        } else {
            comment = " is an ordinary year!";
        }

        System.out.println(year + comment);

        scan.close();
    }
}
