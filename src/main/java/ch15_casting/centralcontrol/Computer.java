package ch15_casting.centralcontrol;

public class Computer implements Power{

    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    // 다운캐스팅 한 이루에 테스트 할 메서드 작성
    public void compute() {
        System.out.println("컴퓨터가 계산합니다.");
    }
}
