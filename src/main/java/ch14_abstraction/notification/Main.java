package ch14_abstraction.notification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String formatCheck = "";
        String newMessage;
        EmailNotification emailNotification1 = new EmailNotification("admin@test.com", "user@example.com", "입실 체크하세요.", 0);

        emailNotification1.printNotificationInfo();
        System.out.println();

        System.out.print("메시지를 입력하시오 >>> ");
        newMessage = scan.nextLine();

        emailNotification1.updateMessage(newMessage);
        emailNotification1.printNotificationInfo();
        System.out.println();

        emailNotification1.send();
        emailNotification1.validateRecipient();

        emailNotification1.formatMessage();
        System.out.println();

        System.out.println("포맷된 메시지 출력 : ");
        System.out.println(emailNotification1.getMessage());
    }
}
