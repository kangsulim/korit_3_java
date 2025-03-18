package ch08_methods;

import java.util.Scanner;

public class Method01 {
    /*
        메서드 정의
     */

    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("1. [ x | x ]");
        System.out.println("배고프당..\n");
    }

    // 2. [ o | x ] [ 입력값 / 출력값 ]
    public static void call2(String str) {  // 정의 단계에서 () 내에 있으면 매개변수(파라미터)
        System.out.println("2. [ o | x ]");
        System.out.println("좀 있다 " + str + " 먹어야징~\n");
    }

    // 3. [ x | o ] [ 입력값 / 출력값 ]
    public static String call3() {      // return의 자료형이 String임을 명시
        System.out.println("3. [ x | o ]");

        String result = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++){
                result += "*";
            }
            result += "\n";
        }
        return result;      // return이 있다.
    }

    // 4. [ o | o ] [ 입력값 / 출력값 ]
    public static String call4(int year, int month, int date, String day) {
        System.out.println("4. [ o | o ]");

        String result = "";

        result = year + "년 " + month + "월 " + date + "일 " + day + "요일입니다.\n";

        return result;
    }

    public static int writeMyage1(int age) {
        int num = age;

        return num;
    }

    public static void writeMyage2(int age) {
        System.out.println(age);
    }

    /*
        함수형 프로그래밍(functional programming) :
            메서드1의 return 값이 메서드2의 argument가 되고,
            메서드2의 return 값이 메서드 3의 argument가 되는 방식으로,

            첫 번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 방식!!

            예시,
     */
    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n내년에 " + (age + 1) + "살입니다.";
    }

    public static void main(String[] args) {
        System.out.println("[ 입력값 / 출력값 ]");
        // md 파일에 작성한 3번 호출 방식
        String menu = "밥";

        call1();
        call2(menu);    // 호출 단계에서 () 내에 있는 것은 인수(argument)
        System.out.println(call3());
        // 왜 main 단계에서 꼭 sout을 써야하는가.
        // method 내부에 sout을 써두면 호출할 때 더 편한 게 아닌가?
        System.out.println(call4(2025, 3, 17, "월"));

        writeMyage1(26); // 안 찍힘
        writeMyage2(26); // 찍힘

        System.out.println(writeMyage1(26));

        int nextAge1 = writeMyage1(26) + 1;
        System.out.println(nextAge1);

//        int nextAge2 = writeMyage2(26) + 1;
//        System.out.println(nextAge2);

        System.out.println();

        Scanner scan = new Scanner(System.in);
        String myName = "";
        int myAge = 0;

        System.out.print("이름을 입력하시오 >>> ");
        myName = scan.nextLine();
        System.out.print("나이를 입력하시오 >>> ");
        myAge = scan.nextInt();
        System.out.println(introduce(myName, myAge));

        System.out.println(myName);
        System.out.println(myAge);

    }
}
