package ch07_loops;

import java.util.Scanner;

/*
    while과 for

    1부터 n까지의 합을 구하는 반복문
    반복하시겠습니까? Y/N >>> N이 나올 때ㅏ지 반복할 것
 */
public class Loop06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isEnded = false;
        String answer = "";
        int sum = 0;

        while (!isEnded) {
            int n = 0;
            sum = 0;
            System.out.print("1부터 몇까지의 합을 구할래요? >>> ");
            n = scan.nextInt();

            for (int i = 0; i < n + 1; i++) {
                sum += i;
            }

            System.out.println("합은 " + sum + "입니다.");
            System.out.println();

            System.out.print("또 계산 시작할래요? Y/N >>> ");
            scan.nextLine();
            answer = scan.nextLine();
            System.out.println();
            if (answer.equals("N")){
                isEnded = true;
            }


        }


    }
}
