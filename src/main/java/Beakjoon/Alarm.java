package Beakjun;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hour, minute;

        System.out.println("시간을 입력하시오(ex. 22 22) >>> ");
        hour = scan.nextInt();
        minute = scan.nextInt();

        if (minute >= 45) {
            minute -= 45;
        } else {
            hour -= 1;
            if (hour < 0) {
                hour += 24;
            }
            minute = minute + 60 - 45;
        }

        System.out.println(hour + " " + minute);
    }


}
