package ch15_casting.centralcontrol;

public class SmartPhone implements Power{
    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void touch() {
        System.out.println("스마트 폰을 터치합니다.");
    }
}
