package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner class import
        Scanner scan = new Scanner(System.in);

//        System.out.print("올해 년도를 입력하시오 >>> ");
////        int year = scan.nextInt();
//        String year = scan.nextLine();
//        System.out.println();
//        System.out.println("올해는 " + year + "년입니다.");
//        System.out.println("내년은 " + year + 1 + "년입니다.");
//        System.out.println("내년은 " + (year + 1) + "년입니다.");

//        System.out.print("당신의 이름을 입력하시오 >>> ");
//        String name = scan.nextLine();
//        System.out.println("제 이름은 " + name + "입니다.");

        /*
            String 자료형으로 변수를 선언, 초기화 할 때
            String 변수명 = scan.nextLine();

            int 자료형으로 변수를 선언, 초기화 할 때
            int 변수명 = scan.nextInt();

            double 자료형으로 변수를 선언, 초기화 할 때
            double 변수명 = scan.nextDouble();

            Scanner를 사용할 때, 콘솔에 입력한 데이터를 변수에 저장하게 되는데,
            그 자료형을 고려하여 작성할 필요성이 있습니다.
         */

//        System.out.print("키를 입력하시오 >>> ");
//        double height = scan.nextDouble();
//        System.out.println("제 키는 " + height + "cm입니다.");

//         실행 예
//         나이를 입력하시오 >>> 19

        System.out.print("나이를 입력하시오 >>> ");
        int age = scan.nextInt();
        System.out.println("저는 올해 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");

        scan.close();
    }
}
