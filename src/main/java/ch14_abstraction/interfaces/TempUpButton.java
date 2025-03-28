package ch14_abstraction.interfaces;

public class TempUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 1도 올립니다.");
    }
    @Override
    public String onUp() {
        return "온도를 계속 " + super.onUp();
    }
}
