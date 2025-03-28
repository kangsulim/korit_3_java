package ch15_casting.centralcontrol;

public class Main {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        Mouse mouse2 = new Mouse();

        CentralControl centralControl = new CentralControl(new Power[10]);

        centralControl.addDevice(computer1);    // 업캐스팅 발생 (암시적)
        centralControl.addDevice(led1);
        centralControl.addDevice(mouse1);

        // 추가 생성한 객체
        Tv tv1 = new Tv();
        Speaker speaker1 = new Speaker();
        SmartPhone smartPhone1 = new SmartPhone();

        centralControl.addDevice(tv1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(smartPhone1);

        System.out.println();


        centralControl.setDeviceArray(mouse2, 9);
        System.out.println();

        centralControl.powerOn();
        System.out.println();

        centralControl.powerOff();
        System.out.println();

        centralControl.displayInfo();
        System.out.println();

        centralControl.performSpecificMethod();
    }
}
