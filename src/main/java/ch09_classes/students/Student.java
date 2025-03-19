package ch09_classes.students;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
    1. 필드 정의
        int studentCode
        String name
        double score

    2. 기본 생성자 정의, 객체 생성 시
        "기본 생성자로 객체가 생성되었습니다." 출력

    3. studentCode 매개변수

    4. name 매개변수

    5. studentCode, name 매개변수

    6. studentCode name socre 매개변수

    7. StudentMain 클래스 생성
        1) student1 2025001 / 김일 / 4.5
        2) student2 2025002 / 김이 / 4.5
        3) student3 2025003 / 김삼 / 4.5
        4) student4 2025004 / 김사 / 4.5
        5) student5 2025005 / 김오 / 4.5

 */
public class Student {
    Scanner scan = new Scanner(System.in);
    int studentCode;
    String name;
    double score;

    Student() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    Student(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체가 생성되었습니다.");
        this.studentCode = studentCode;
    }

    Student(String name) {
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다.");
        this.name = name;
    }

    Student(int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체가 생성되었습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }

    Student(int studentCode, String name, double score) {
        System.out.println("int, String, double 매개변수 생성자로 객체가 생성되었습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    void showInfo() {
        System.out.println("\n[ " + name + " ]" + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }

    void changeName() {
        System.out.print("바꿀 이름을 입력하시오 >>> ");
        name = scan.nextLine();

        int check;

        System.out.print("바뀐 정보를 확인하시겠습니까?\n");
        System.out.println("1. 확인하기 2. 나가기");
        check = scan.nextInt();

        if (check == 1)
            showInfo();
    }
}
