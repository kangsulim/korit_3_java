package ch14_abstraction.interfaces;

public class TempDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 1도 내립니다");
    }

    @Override
    public void onDown() {
        System.out.println("온도를 계속 내립니다");
    }
}
