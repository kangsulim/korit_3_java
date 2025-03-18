package ch07_loops;

import java.util.Scanner;

/*
    몇 줄의 별을 생성하시겠습니까? >>> 3
    *
    **
    ***
 */
public class Loop08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line;
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        line = scan.nextInt();

        for (int i = 0; i < line + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < line; i++) {
            for (int j = line; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = line; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
