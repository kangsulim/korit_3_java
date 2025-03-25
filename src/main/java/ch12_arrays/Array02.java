package ch12_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
//        int[] arr01 = new int[100];
//        int cnt = 0;
//
//        for (int i = 0; i < arr01.length; i++) {
//
//            arr01[i] = i + 1;
//
////            System.out.println(arr01[i]);
//            if (arr01[i] % 3 == 0) {
//                System.out.print(arr01[i] + "\t");
//                cnt++;
//                if (cnt % 5 == 0) {
//                    System.out.println();
//                }
//            }
//        }

        /*
            String[] names 배열에
            출석부의 이름을 입력하여
            names 배열에 값을 집어넣는 프로그램 작성

            실행 예
            몇 명의 학생을 등록하시겠습니까? >>> 15
            1번 학생 : 강수림
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("몇 명의 학생을 등록하겠습니까? >>> ");
        int student = scan.nextInt();

        String[] names = new String[student];

        scan.nextLine();


        for (int i = 0; i < names.length; i++) {
            int index = i + 1;
            System.out.print(index + "번 학생 이름 : ");
            names[i] = scan.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            int index = i + 1;
            if (index % 5 == 0) {
                System.out.println(names[i]);
            }
        }
    }
}
