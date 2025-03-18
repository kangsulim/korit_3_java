package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // ClassA를 import

        ClassA classA = new ClassA();

        // 클래스명 객체명 = new 클래스명();

        // Scanner import
        Scanner scan = new Scanner(System.in);
        // Scanner 클래스의 인스턴스 scan

        // 객체의 속성을 참조하는 법 : 객체명.속성명
//        System.out.print("이름을 입력하시오 >>> ");
//        classA.name = scan.nextLine();
//        System.out.println(classA.name);

//        ClassA classA1 = new ClassA();
//
//        System.out.print("이름을 입력하시오 >>> ");
//        classA1.name = scan.nextLine();
//        System.out.print("점수를 입력하시오 >>> ");
//        classA1.score = scan.nextInt();
//        System.out.print("학번을 입력하시오 >>> ");
//        classA1.num = scan.nextInt();
//
//        System.out.println();
//        System.out.println("[ 실행 결과 ]");
//        System.out.println(classA1.num + " - 이름 : " + classA1.name + ", 점수는 " + classA1.score + "점입니다.");

        // 객체의 속성에 값을 대입하고 출력하는 방법 !!!

        // method를 호출하는 방법 !!!
        ClassA classA2 = new ClassA();
        classA2.name = "김이";
        classA2.callName();

        ClassA classA3 = new ClassA();
        classA3.name = "이삼";
        classA3.callName();

        scan.close();
    }
}
