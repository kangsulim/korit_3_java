package ch14_abstraction.notification;
/*
    1. NotificationSystem 상속
    2. 추상 메서드 구현
        send() :
        메시지를 전송합니다.
        "여기에 메시지 내용 출력"

        formatMessage() :
        <p>"여기에 메시지 내용 출력"</p>
        메시지가 HTML 형식으로 포맷되었습니다.

        validateRecipient() :

 */

public class EmailNotification extends NotificationSystem{

    public EmailNotification(String sender, String recipient, String message, int priority) {
        super(sender, recipient, message, priority);
    }

    @Override
    public void send() {
        System.out.println("메시지 전송 시작");
        System.out.println("\"" + getMessage() + "\"");
        System.out.println("메시지 전송 완료");
    }

    @Override
    public void validateRecipient() {
        if (!getRecipient().contains("@")) {
            System.out.println("잘못된 이메일 주소 형식입니다.");
        } else {
            System.out.println("이메일 주소 형식이 유효합니다.");
        }
    }

    @Override
    public void formatMessage() {
        String formattedMessage = "<p>" + getMessage() + "</p>";
        System.out.println("메시지 포맷을 처리합니다.");
        setMessage(formattedMessage);
        System.out.println(getMessage());
        System.out.println("메시지가 HTML 형식으로 포맷되었습니다.");
    }

    @Override
    public String getSender() {
        return super.getSender();
    }

    @Override
    public void setSender(String sender) {
        super.setSender(sender);
    }

    @Override
    public String getRecipient() {
        return super.getRecipient();
    }

    @Override
    public void setRecipient(String recipient) {
        super.setRecipient(recipient);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void setMessage(String message) {
        super.setMessage(message);
    }

    @Override
    public int getPriority() {
        return super.getPriority();
    }

    @Override
    public void setPriority(int priority) {
        super.setPriority(priority);
    }
}
