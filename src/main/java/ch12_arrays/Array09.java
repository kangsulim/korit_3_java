package ch12_arrays;

import java.util.Scanner;

public class Array09 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String[] names =
//                {"강수림", "기준성", "김미진", "김준식", "문성진",
//                "심민호", "양지은", "유지현", "윤현지", "이동규",
//                "이예성", "이정화", "전남용", "채수원", "한영진"};
        System.out.print("몇 명의 학생을 입력하시겠습니까 >>> ");
        int numOfStd = scan.nextInt();
        String[] students = new String[numOfStd];

        scan.nextLine();

        for (int i = 0; i < students.length; i++) {
            System.out.print((i + 1) + "번 학생의 이름을 입력하시오 >>> ");
            students[i] = scan.nextLine();
        }

        System.out.println(" [ 일반 for 문으로 작성 ]");
        System.out.println("      -----------");
        for (int i = 0; i < students.length; i++) {
            System.out.println("      |  " + students[i] + "  |");
            System.out.println("      -----------");
        }
        
        System.out.println("[ 향상된 for 문으로 작성 ]");
        System.out.println("      -----------");
        for (String student : students) {
            System.out.println("      |  " + student + "  |");
            System.out.println("      -----------");
        }
    }
}
