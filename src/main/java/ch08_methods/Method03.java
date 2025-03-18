package ch08_methods;

import java.util.Scanner;

public class Method03 {
    public static String getStar(int rows, int select) {    // rows와 rowOfStars는 다른 개념
        String result = "";

        String star = "^";  // 찍을 별 모양

        switch (select) {
            case 1:     // 왼쪽으로 치우친 증가하는 별
                for (int i = 0; i < rows + 1; i++) {
                    for (int j = 0; j < i; j++) {
                        result += star;
                    }
                    result += "\n";
                }
                break;
            case 2:     // 오른쪽으로 치우친 증가하는 별
                for (int i = rows; i > 0; i--) {
                    for (int j = 0; j < i - 1; j++) {
                        result += " ";
                    }
                    for (int k = rows; k > i - 1 ; k--) {
                        result += star;
                    }
                    result += "\n";
                }
                break;
            case 3:     // 왼쪽으로 치우친 감소하는 별
                for (int i = rows; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        result += star;
                    }
                    result += "\n";
                }
                break;
            case 4:     // 오른쪽으로 치우친 감소하는 별
                for (int i = rows; i > 0; i--) {
                    for (int j = rows; j > i; j--) {
                        result += " ";
                    }
                    for (int k = 0; k < i; k++) {
                        result += star;
                    }
                    result += "\n";
                }
                break;
            default:
                result += "1~4 사이의 옵션을 골라주세요.";
                break;
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
// Overloading 클래스 생성