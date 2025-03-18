package ch06_condition;

import java.util.Scanner;

/*
    switch문

    switch(변수명)
        case 조건1:
            코드1
            break;
        case 조건2:
            코드2
            break;
        case 조건3:
            코드3
            break;
        case 조건4:
            코드4
            break;
        default:
            코드5
 */
public class Condition07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String selected = null;


        System.out.println("[선택 프로그램]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");

        System.out.print("메뉴를 선택하세요 >>> ");

        selected = scan.nextLine();
        
        // #1 if 문으로 작성한 경우
        if (selected.equals("a")) {
            System.out.println("메뉴1을 선택하셨습니다.");
        } else if (selected.equals("b")) {
            System.out.println("메뉴2을 선택하셨습니다.");
        } else if (selected.equals("c")) {
            System.out.println("메뉴3을 선택하셨습니다.");
        } else if (selected.equals("d")) {
            System.out.println("메뉴4을 선택하셨습니다.");
        } else if (selected.equals("e")) {
            System.out.println("메뉴5을 선택하셨습니다.");
        } else {
            System.out.println("a~e 중에 메뉴를 선택하세요.");
        }

        // #2 switch 문으로 작성한 경우
        switch (selected) {
            case "a":
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:
                System.out.println("a~e 중에 메뉴를 선택하세요.");
        }

        scan.close();
    }
}
