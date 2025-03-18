package ch06_condition;

import java.util.Scanner;

public class Condition07_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int selected;


        System.out.println("[선택 프로그램]");
        System.out.println("1. 메뉴1");
        System.out.println("2. 메뉴2");
        System.out.println("3. 메뉴3");
        System.out.println("4. 메뉴4");
        System.out.println("5. 메뉴5");

        System.out.print("메뉴를 선택하세요 >>> ");

        selected = scan.nextInt();

        // #2 switch 문으로 작성한 경우
        switch (selected) {
            case 1:
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:
                System.out.println("1~5 중에 메뉴를 선택하세요.");
        }
    }
}
