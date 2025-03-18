package ch06_condition;
/*
    if(실행문1){
    코드
    } else if(실행문2) {
    코드
    } else if(실행문3) {
    코드
    } else {
    코드
    }
 */
import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        String rating = "";


        System.out.print("회원 포인트를 입력하시오 >>> ");
        point = scan.nextInt();

        if(point > VIP_POINT) {
            rating = "VIP";
        } else if(point > GOLD_POINT) {
            rating = "GOLD";
        } else if(point > SILVER_POINT) {
            rating = "SILVER";
        } else if(point > BRONZE_POINT) {
            rating = "BRONZE";
        } else {
            rating = "NORMAL";
        }

        System.out.println("당신의 등급은 " + rating + "입니다.");

        scan.close();
    }
}
