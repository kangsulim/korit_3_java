package ch06_condition;

import java.util.Scanner;

/*
    조건문
    1. if문 : if 다음에 있는 ()내의 조건식이 true일 때 {} 내의 코드가 실행됨

    if(조건식) {
        내용
    }
 */
public class Condition01 {
    public static void main(String[] args) {
        int num = 10;

        if (num > 0) {
            System.out.println("num은 양수입니다.");
        }

        System.out.println();

        System.out.print("num2를 입력하시오 >>> ");
        Scanner scan = new Scanner(System.in);
        int num2 = scan.nextInt();

        if (num2 > 0) {
            System.out.println("num2는 양수입니다.");
        }
    }
}
