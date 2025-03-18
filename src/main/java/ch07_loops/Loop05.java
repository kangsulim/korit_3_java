package ch07_loops;
/*
    중첩 for문
 */
public class Loop05 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println(i + "일차 " + j + "교시입니다.");
            }
        }
        System.out.println();


        // 구구단 출력하기
        for (int i = 2; i < 10; i++) {
            System.out.print(i + "단\t\t\t");
        }

        System.out.println();

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " X " + i + " = " + (j*i) + "\t");
            }
            System.out.println();
        }
        System.out.println();



        for (int i = 1; i < 101; i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        for (int i = 1; i < 101; i += 10) {
            System.out.println(i + "\t" +(i+1) + "\t" +(i+2) + "\t" +(i+3) + "\t" +(i+4) + "\t" +(i+5) + "\t" +(i+6) + "\t" +(i+7) + "\t" +(i+8) + "\t" +(i+9));
        }








    }
}
