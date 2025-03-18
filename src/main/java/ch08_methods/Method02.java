package ch08_methods;

import java.util.Scanner;

/*
    메서드에서 별찍기 구현하기
 */
public class Method02 {
    public static String getStar(int rows, int select) {    // rows와 rowOfStars는 다른 개념
        String result = "";

        String star = "*";

        if (select == 1) {
            for (int i = 0; i < rows + 1; i++) {
                for (int j = 0; j < i; j++) {
                    result += star;
                }
                result += "\n";
            }
        } else if (select == 2){
            for (int i = rows; i > 0; i--) {
                for (int j = 0; j < i - 1; j++) {
                    result += " ";
                }
                for (int k = rows; k > i - 1 ; k--) {
                    result += star;
                }
                result += "\n";
            }
        } else if (select == 3) {
            for (int i = rows; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        result += star;
                    }
                    result += "\n";
                }
        } else if (select == 4) {
            for (int i = rows; i > 0; i--) {
                for (int j = rows; j > i; j--) {
                    result += " ";
                }
                for (int k = 0; k < i; k++) {
                    result += star;
                }
                result += "\n";
            }

        } else {
            result = "1~4 사이의 옵션을 선택해주세요.";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scan.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("옵션을 선택하세요. >>> ");
        choice = scan.nextInt();

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);

        scan.close();
    }
}
