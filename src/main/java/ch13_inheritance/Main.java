package ch13_inheritance;

import java.util.HashMap;

/*
    Animal
    Human
    Tiger
    Main
    생성
 */
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나비");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("바둑이");
        
        // Animal 클래스의 객체를 만들 때 각각의 생성자를 호출했는데, 만약에
        // Dog와 Cat에 각각 dogName/ catName 필드를 생성하고, 또 생성자를 만들고
        // dog1과 cat1이라는 객체를 생성했을 것이다.
        // 상속을 사용했을 때를 보기 위한 Tiger 클래스

        // Tiger 객체 생성
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("푸바오");
        tiger1.setAnimalAge(5);

        System.out.println(tiger1.getAnimalName() + "는 올해 " + tiger1.getAnimalAge() + "살입니다");

        tiger1.move();      // super.move()일 경우 -> 움직입니다 출력
        tiger1.Hunt();

        animal3.move();
//        animal3.hunt(); // 부모 클래스가 자식 클래스의 메서드를 사용할 수는 없음
        System.out.println();

        Human human1 = new Human();

        human1.setAnimalName("강수림");
        human1.setAnimalAge(26);

        human1.move();
        human1.introduce();
        human1.read("자바의 기초");
    }
}
