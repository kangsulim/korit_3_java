package ch00_review;
/*
    학생 정보를 저장하는 클래스

    필드
    name, age, studentId, password
 */

import java.util.Scanner;

class Student {
    public String name;
    public int age;
    int studentId;
    private String password;

    public void setPassword(String password) {
        if (password.length() < 5) {
            System.out.println("비밀번호가 너무 짧습니다.");
            return;
        } else {
            System.out.println("비밀번호 설정 성공!");
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }

    public void showInfo() {
        System.out.println("학번 : " + studentId);
        System.out.println("이름 : " + name + " 학생");
        System.out.println("나이 : " + age + "세\n");
    }

    public void resetPassword() {
        Scanner scan = new Scanner(System.in);
        String prevPassword, presentPassword, newPassword1 = "", newPassword2 = "";

        prevPassword = getPassword();

        System.out.print("기존 비밀번호를 입력하시오 >>> ");
        presentPassword = scan.nextLine();

        if (prevPassword.equals(presentPassword)) {
            while(newPassword1.length() < 5 ) {
                System.out.print("바꿀 비밀번호를 입력하시오 >>> ");
                newPassword1 = scan.nextLine();
            }

            System.out.print("비밀번호를 다시한 번 입력하시오 >>> ");
            newPassword2 = scan.nextLine();

            while(!newPassword2.equals(newPassword1)) {
                System.out.print("비밀번호를 다시한 번 입력하시오 >>> ");
                newPassword2 = scan.nextLine();
            }

            if (newPassword1.equals(newPassword2)) {
                setPassword(newPassword1);
                System.out.println("비밀번호 변경이 완료되었습니다.");
            }
        } else {
            System.out.print("비밀번호가 다릅니다. 다시 입력하시오 >>> ");
        }

    }
}

public class Review12 {
    public static void main(String[] args) {
        Student student1 = new Student();

        // 바로 대입 가능한 이름, 나이, 학번
        student1.name = "김일";
        student1.age = 17;
        student1.studentId = 20250001;

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.studentId);
        System.out.println();

        // setter를 통한 비밀번호 대입
        student1.setPassword("1537");
        student1.setPassword("1q2w3e4r");
        System.out.println();

        System.out.println(student1.getPassword());

        student1.showInfo();

        student1.resetPassword();
        System.out.println();

        System.out.println(student1.getPassword());
    }
}
