package ch00_review;

import java.util.Scanner;

public class Review02 {
    public static void main(String[] args) {
        /*
            연산자
            1) 대입 연산자 =
            2) 복합 대입 연산자
                +=
                -=
                *=
                /=
         */

        double height = 0;
        double width = 0;
        double rectangle, triangle;

        height = 30.3;
        width = 124.37;

        rectangle = height * width;
        triangle = rectangle / 2;

        System.out.println("가로 " + width + ", 세로 " + height + "인 사각형의 넓이는 " + rectangle + "입니다.");
        System.out.println("가로 " + width + ", 세로 " + height + "인 삼각형의 넓이는 " + triangle + "입니다.");

        Scanner scan = new Scanner(System.in);
        
        double height1, width1, rectangle1, triangle1;

        System.out.println("가로, 세로의 길이를 입력하면 그에 해당하는 직사각형과 삼각형의 넓이를 구하는 프로그램입니다.\n");

        System.out.print("높이를 입력하시오 >>> ");
        height1 = scan.nextDouble();
        System.out.print("밑변의 길이를 입력하시오 >>> ");
        width1 = scan.nextDouble();
        System.out.println();

        rectangle1 = height1 * width1;
        triangle1 = rectangle1 / 2;

        System.out.println("가로 " + width1 + ", 세로 " + height1 + "인 사각형의 넓이는 " + rectangle1 + "입니다.");
        System.out.println("가로 " + width1 + ", 세로 " + height1 + "인 삼각형의 넓이는 " + triangle1 + "입니다.");
        
    }
}
