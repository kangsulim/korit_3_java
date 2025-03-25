package ch12_arrays;

import java.util.Scanner;

public class Array04 {
    public void writeNames(String[] names) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + "번 학생 : ");
            names[i] = scan.nextLine();
        }
    }

    public void printNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 메서드 사용을 위한 객체 생성
        Array04 array04 = new Array04();

        // 인덱스 넘버
        System.out.print("몇 명의 학생을 입력하시겠습니까 >>> ");
        int num = scan.nextInt();
        scan.nextLine();

        // 비어있는 배열 선언
        String[] names = new String[num];

        array04.writeNames(names);
        array04.printNames(names);
    }
}
