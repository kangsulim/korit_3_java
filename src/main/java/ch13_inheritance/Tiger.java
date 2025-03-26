package ch13_inheritance;

public class Tiger extends Animal{  // (자식) 클래스명 extends (부모) 클래스명

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName);              // super()
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override           // 얘가 붙어있다면 해당 메서드는 상속 받은 것
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);      // 키워드 super.메서드명()
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
        super.move();
        System.out.println("네 발로 움직입니다.");  // 재정의 부분
    }

    public void Hunt() {
        System.out.println("사냥합니다.");
    }
}
