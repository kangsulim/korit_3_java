package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본 생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        constructor1.num = 1;
        constructor1.name = "김일";
        
        // 매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(2);
        System.out.println(constructor2.num);
        constructor2.num = 2;
        constructor2.name = "김이";

        // AllArgsConstructor를 사용한 객체 생성
        Constructor constructor3 = new Constructor(3, "김삼");

        Constructor constructor4 = new Constructor("김사");
        constructor4.num = 4;
        System.out.println(constructor4.name);

        constructor1.showInfo();
        constructor2.showInfo();
        constructor3.showInfo();
        constructor4.showInfo();

    }
}
