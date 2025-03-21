package ch00_review;
/*
    Getter / Setter

    객체명.속성명 = 속성값; 의 형태가 불가능한 경우

    1. Setter : 속성값을 대입하기 위한 method
    2. Getter : 속성값을 조회하기 위한 method
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
