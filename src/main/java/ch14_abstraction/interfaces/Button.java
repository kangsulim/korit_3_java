package ch14_abstraction.interfaces;
/*
    인터페이스의 다중 상속 기능
    : implements
 */
public abstract class Button implements Press, Up, Down {

    @Override
    public void onDown() {} // 메서드를 작성한 척 하는... 약간의 꼼수

    @Override
    public abstract void onPressed();

    @Override
    public String onUp() {
        return "올립니다.";
    }
}
