package ch09_classes;
/*
    생성자(Constructor)
        생성자는 객체가 생성될 때 호출되는 '특별한' 메서드

    ClassExample example = new ClassExample();
    : 사실 'ClassExample()'가 생성자

    특징 :
        1. 클래스의 이름과 생정자 이름은 동일하다.
            (다른 메서드들과 달리 대문자로 시작한다.)
        2. return 값이 없다 -> call1(), call2() 유형으로 볼 수 있다.
        3. 객체 초기화 : 생성자는 객체의 필드(속성) 초기화를 담당한다.

    생성자의 정의 방식
        1. 기본 생성자 : 매개변수가 없는 생성자
            (사실 클래스를 만들 때 default로 생성되어 정의하지 않을 때도 있음
            ClassA, Car에서 기본 생성자를 정의하지 않고
            ClassAMain, CarMain에서 객체를 생성해보았다.
        2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자
 */
public class Constructor {
    // 필드 선언
    int num;
    String name;
    
    // 기본 생성자 정의 -> 직접하면 call1()과 같은 형대
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)"); // argument가 없는 생성자
    }
    
    // 매개변수 생성자 -> 기본적으로 만들어지지 않는다. 직접 정의해야함
    // 기본 생성자와 매개변수 생성자를 모두 쓰고 싶다면 -> 둘 다 정의해야함

    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number;  // this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체됨.
                            // ex) 여기서 this는 constructor나 constructor1 등이 될 수 있음.
    }

    // String title을 매개변수로 하는 생성자를 정의하고,
    // RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)라는 안내문을
    // 출력할 수 있도록 작성하고
    // Main에서 4, title에 "이름"

    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        this.name = title;
    }
    
    // -> '동일한 이름'을 가지고 '매개변수가 다른' 여러 개의 생성자를 만들 수 있다 --->>> 오버로딩(overloading)으로 볼 수 있다!!!
    
    Constructor(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("AllArgsConstructor(int, String 매개변수 전체를 요구하는 생성자)");
    }

    // method 정의
    void showInfo() {
        System.out.println("이 객체의 num 값 : " + num);
        System.out.println("이 객체의 name 값 : " + name);
    }
}
