package ch00_review;

import java.util.Scanner;

public class Review04 {
    public static void main(String[] args) {
        /*
            for 반복문
            for ( 시작값 ; 한계값 ; 증감값 ) {
                실행문
            }
            시작값에는 처음 선언하는 변수를 사용해야 오류를 최소화 할 수 있습니다.
            
            for ( 시작값 ; 한계값 ; 증감값 ) {
                실행문1
                while/if/for() {
                    실행문
                }
            }
         */
        
//        int limitNumber = 100;

//        // 하드 코딩의 예시
//        for (int i = 0; i < limitNumber; i++) {
//            if ((i+1) % 2 == 0) {
//                System.out.print((i + 1) + "\t");
//            }
//            if (i % 20 == 0)
//                System.out.println();
//        }
//        System.out.println();

//        // 변수를 통한 예시 <- 이 방법을 사용하는데 익숙해지자
//        for (int i = 0; i < limitNumber; i++) {
//            int addedI = i + 1;
//            if (addedI % 2 == 0) {
//                System.out.print(addedI + " \t");
//            }
//            if (i % 20 == 0)
//                System.out.println();
//        }
//
//        System.out.println();

//        int i = 0;
//
//        // while 을 이용한 홀수 출력
//        while ( i < limitNumber) {
//            if (i % 2 == 1) {
//                System.out.print(i + "\t");
//            }
//            if (i % 20 == 0) {
//                System.out.println();
//            }
//            i++;
//        }

        /*
            클래스 import
            변수 선언
         */
        // 사용할 클래스 목록(객체 생성)
        Scanner scan = new Scanner(System.in);

        // 사용할 변수 목록
        int numOfStudent = 0;
        double sum = 0, avg;
        String again = "";

        System.out.print("학생은 몇 명인가요? >>> ");
        numOfStudent = scan.nextInt();

        /*
            sum, avg는 아직 사용하지 않았지만 미리 선언되었고
            numOfStudent의 경우에는 몇 줄만 더 내려가면 쓸 건데
            왜 굳이 위에서 선언했을까
            
            1. 코드가 길어져도 유지보수성을 보장하기 위해
            2. 코드의 내용을 유추할 수 있기 때문에
            
              ex)클래스와 변수를 보니 학생 들의 점수를 받아서
                 평균을 내는 프로그램을 작성할 것 같네?
         */

        if (numOfStudent > 0) {
            for (int i = 0; i < numOfStudent; i++) {
                double score;
                System.out.print((i+1) + "번째 학생의 점수를 " + again + "입력하시오. >>> ");
                score = scan.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("점수의 범위가 잘못되었습니다.");
                    again = "다시 ";
                    i--;
                } else {
                    if (again.equals("다시 "))
                        again = "";
                    sum += score;
                }
            }

            avg = sum / numOfStudent;

            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + avg);
        } else {
            System.out.println("학생수를 1명 이상 입력하지 않아 프로그램이 종료됩니다.");
        }
    }
}
