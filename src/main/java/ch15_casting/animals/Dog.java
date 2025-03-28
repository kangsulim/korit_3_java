package ch15_casting.animals;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍");
    }

    public void fetch() {
        System.out.println("강아지가 공을 물어옵니다.");
    }
}
