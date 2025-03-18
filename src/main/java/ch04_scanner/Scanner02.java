package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            문자열 입력
            next() : 띄어쓰기를 포함하지 않음
            nextLine() : 띄어쓰기를 포함하고 개행 기준으로 데이터를 입력 받음
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("이름을 입력하세요 >>> ");
        String name = scan.nextLine();

        System.out.print("주소를 입력하세요 >>> ");
        String address = scan.nextLine();

        System.out.print("나이를 입력하세요 >>> ");
        int age = scan.nextInt();
        System.out.println();

        System.out.println("-----------------");
        System.out.println("| 이름 : " + name + "\t|");
        System.out.println("| 주소 : " + address + "\t|");
        System.out.println("| 나이 : " + age + "\t\t|");
        System.out.println("| 내년 나이 : " + (age + 1) + "\t|");
        System.out.println("-----------------");

        scan.close();
    }
}
