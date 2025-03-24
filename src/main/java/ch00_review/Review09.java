package ch00_review;
/*
    Getter / Setter

    객체명.속성명 = 속성값; 의 형태가 불가능한 경우

    1. Setter : 속성값을 대입(변경)하기 위한 method를 통칭합니다.
        set+속성명으로 이루어져있습니다.
        ex) setBatteryTime()
        a. call2() 유형입니다.
        b. 내부에 로직을 작성하여 필드의 논리적인 개념에 맞지 않는
            데이터를 걸러낼 수 있습니다.(배터리타임이 음수면 아예 메서드를 정지시킬 수 있음)
        생성자 때와 마찬가지로 alt + ins -> Setter 선택으로 자동 생성 가능
        -> 매개변수와 argument는 서로 다른 개념이다.

    2. Getter : 속성값을 조회하기 위한 method를 통칭
        get+속성명으로 이루어져있습니다.
        ex) getBatteryTime()
        a. call3() 유형입니다.
        b. main단계에서 데이터 조회시의 조작이 가능합니다.

        ex) System.out.println(watch1.getButton() + "!"); // true!
        setter와 마찬가지로 alt + ins를 통해서 작성이 가능합니다.
 */
class SmartWatch {
    private boolean button;
    private boolean celular;
    private int batteryTime;
    private String title;

    SmartWatch() {
    }

    SmartWatch(String title) {
        this.title = title;
    }

    void setButton(boolean button) {
        this.button = button;
    }

    void setCelular(boolean celular) {
        this.celular = celular;
    }

    void setBatteryTime(int batteryTime) {
        this.batteryTime = batteryTime;
        if (batteryTime > 10) {
            System.out.println("배터리 잔여시간이 " + batteryTime + "분 남았습니다.");
        } else {
            System.out.println("잘못된 입력. 배터리를 종료합니다.");
            return;
        }
    }

    void setTitle(String title) {
        this.title = title;
    }

    void showInfo() {
        System.out.println("\n이 시계는 " + title + "입니다.");
        System.out.println("배터리 타임이 " + batteryTime + "이지요");
        System.out.println("감사합니다.");
    }
}


public class Review09 {
    public static void main(String[] args) {
        SmartWatch watch1 = new SmartWatch();

        watch1.setButton(true);
        watch1.setCelular(true);
        watch1.setBatteryTime(-10);
        watch1.setBatteryTime(18);
        watch1.setTitle("애플워치");

        watch1.showInfo();


    }
}
