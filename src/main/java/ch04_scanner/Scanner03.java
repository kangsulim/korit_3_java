package ch04_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.print("x 입력 : ");
//        int x = scan.nextInt();
//
//        System.out.print("y 입력 : ");
//        int y = scan.nextInt();
//
//        System.out.println("x + y = " + x + y);
//        System.out.println("(x + y) = " + (x + y));

        System.out.print("a 입력 : ");
        String a = scan.nextLine();

        System.out.print("b 입력 : ");
        String b = scan.nextLine();

        System.out.println("a + b = " + a + b);
        System.out.println("a + b = " + (a + b));
    }
}
