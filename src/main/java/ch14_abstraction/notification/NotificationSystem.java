package ch14_abstraction.notification;

import java.util.Scanner;

/*
    추상 클래스 : NotificationSystem
    서브 클래스 : EmailNotification / SMSNotification
    
    1. 추상 클래스는 공통된 필드를 가진다
        1) String sender : 알림 발신자
        2) String recipient : 알람 수신자
        3) String message : 알람 메시지
        4) int priority : 알람 우선 순위 (1~5)
        
    2. 다음과 같은 메서드를 가진다.
        void printNotificationInfo() : 알람 정보 출력
        void updateMessage(String newMessage) : 메시지 수정
        priority 관련 getter / setter
            setPriority 주의 :
                1~5 범위 / 내부 로직 작성 필요
        
        추상 메서드 
        void send() : 알람 전송
        void validateRecipient() : 수신자 유효성 검증
        void formatMessage() : 메시지 포맷 처리
        
    
 */
public abstract class NotificationSystem {
    // 필드 선언
    Scanner scan = new Scanner(System.in);
    private String sender;
    private String recipient;
    private String message;
    private int priority;

    // AllArgsConstructor
    public NotificationSystem(String sender, String recipient, String message, int priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        while(priority > 6 || priority <1) {
            System.out.print("우선순위를 다시 설정하시오 >>> ");
            priority = scan.nextInt();;
        }
        this.priority = priority;
    }

    // 추상 메서드
    public abstract void send();
    public abstract void validateRecipient();
    public abstract void formatMessage();

    // 고유 메서드
    public void printNotificationInfo() {
        System.out.println("[ 알림 정보 ]");
        System.out.println("From : " + sender);
        System.out.println("Tp : " + recipient);
        System.out.println("Message : " + message);
        System.out.println("Priority : " + priority);
    }

    public void updateMessage(String newMessage) {
        System.out.println("`" + getMessage() + "` 가 `" + newMessage + "`으로 변경되었습니다.\n");
        setMessage(newMessage);
    }

    // getter, setter
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        while(priority > 6 || priority <1) {
            System.out.print("우선순위를 다시 설정하시오 >>> ");
            priority = scan.nextInt();;
        }
        this.priority = priority;
    }
}
