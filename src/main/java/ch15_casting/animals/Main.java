package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.makeSound();           // 울음 소리 : 멍멍
        dog1.fetch();

        Animal animal1 = dog1;      // 업캐스팅 #1
        animal1.makeSound();        // 울음 소리 : 멍멍
//        animal1.fetch()           // 호출 불가. animal1은 Dog의 객체가 아니니까

        dog1.fetch();

        Animal animal2 = new Dog(); // 업캐스팅 #2
        animal2.makeSound();

        Animal animal3 = new Animal();  // 상속 관계가 전혀 없는 객체 생성
        animal3.makeSound();        // 울음 소리 :
        System.out.println();

        // instanceof 연산자 사용
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);

        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);

        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);

        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4);

        System.out.println("animal3 검증 ㄱㄱ");
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);
        
        System.out.println("↑ 업캐스팅");
        System.out.println("↓ 다운캐스팅");

        /*
            다운캐스팅은 명시적으로 이루어져야한다.

            (클래스명)객체명; -> (int)2.3; 과 같은 방식
         */

        Dog dog2 = (Dog) animal2;   // 다운캐스팅 방법
        dog2.makeSound();
        dog2.fetch();   // animal2는 Animal 클래스에 종속되어있기 때문에
        // Dog의 고유 메서드 사용이 불가능 했고
        // 지금은 Dog 클래스의 객체이기 때문에 .fetch() 사용 가능

//        Dog dog3 = (Dog) animal3; // 여기서 오류 발샘
//        dog1.makeSound();   // 여기서 오류 발샘
        // 문제점 : 다운캐스팅은 됐는데, 이후에 실행 중 오류 발생

        /*
            애초에 animal3를 생성할 때 Animal 클래스의 생성자를 호출해서 만들었기 때문에
            다운캐스팅이 불가능하다.

            즉, 이를 막기 위해서는
         */
        Animal animal4 = new Dog();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야만 합니다.
        // 그렇다면 animal3 사례에서와 같은 오류 발생은
        // instanceof 연산자를 통한 조건식을 작성함으로써 방지할 수 있다.

        System.out.println("animal4 검증");
        if (animal4 instanceof Dog) {
            Dog dog4 = (Dog) animal4;

            dog4.makeSound();
            dog4.fetch();
        }

        System.out.println("animal3는 다운캐스팅 불가함을 알았으니 안전한 다운캐스팅 도전");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }
    }
}
