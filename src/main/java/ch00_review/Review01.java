package ch00_review;

import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

//        변수 : 데이터를 담는 바구니인데 이름표를 붙인 것
//        변수 선언 방식
//            자료형 변수면 = 데이터;
//        자료형 : int, double, String, boolean
//        변수명 짓는 규칙 : 카멜케이스
//        ex) myExample
        String name = "강수림";
        int age = 26;
        int birthday = 20000220;

        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "입니다.");
        System.out.println("생년월일은 " + birthday + "입니다.");
        System.out.println("10년 후에 저는 " + (age + 10) + "살이 됩니다. 코됐네용 ㅎㅎ");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        String name1 = "";
        int age1 = 0;
        int birthday1 = 0;

        System.out.print("이름을 입력하시오 >>> ");
        name1 = scan.nextLine();
        System.out.print("나이를 입력하시오 >>> ");
        age1 = scan.nextInt();
        System.out.print("생년월일을 입력하시오(예. 20250320) >>> ");
        birthday1 = scan.nextInt();

        System.out.println("제 이름은 " + name1 + "이고, 나이는 " + age1 + "입니다.");
        System.out.println("생년월일은 " + birthday1 + "입니다.");
        System.out.println("10년 후에 저는 " + (age1 + 10) + "살이 됩니다. 코됐네용 ㅎㅎ");

        scan.close();
    }
}
