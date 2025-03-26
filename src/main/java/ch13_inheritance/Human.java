package ch13_inheritance;
/*
    Tiget.java처럼 Animal 상속
    getter setter 정의
    move() 메서드 오버라이딩
    "사람이 두 발로 걷습니다."만 출력

    Main.java에서
    human1 객체 생성(기본생성자)하여

    setter
    이름 나이 입력

    getter로
    자기소개 출력

    고유 메서드인 read() 정의 밑 콘솔에 출력 / call2() 방식

    실행 예
    사람 객체가 생성되었습니다.
    ...
 */
public class Human extends Animal {
    // 상속을 받게 되면 Animal 클래스의 필드를 그대로 사용 가능합니다.
    // 고유 메서드 처럼 고유 속성도 가질 수 있습니다.
    String smartPhone;

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge, String smartPhone) {
        super(animalName, animalAge); // 부모 필드
        this.smartPhone = smartPhone; // Human 필드
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    void read(String book) {
        System.out.println(getAnimalName() + "은 " + book + "을 읽는 중입니다.");
    }

    void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + getAnimalName() + "이고 나이는 " + getAnimalAge() + "살입니다.");
        System.out.println("저는 내년에 " + (getAnimalAge() + 1) + "살이 됩니다.");
    }

    // 새로 만든 필드인 smartPhone 에 관한 getter/setter 는 추가적으로 작성할 필요성이 있다

    public String getSmartPhone() {
        return smartPhone;
    }

    public void setSmartPhone(String smartPhone) {
        this.smartPhone = smartPhone;
    }
}
