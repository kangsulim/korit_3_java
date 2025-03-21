package ch00_review;
/*
    클래스 - 설계도 / 틀 / 청사진
    클래스 내부에는
        1. 속성(필드 / 멤버변수 / 인스턴스 변수)
        2. 행위(메서드)
            - 생성자
            - getter / setter


 */

class Developer {
    // 필드 선언
    String name;
    boolean window;
    boolean java;
    boolean python;
    int career;
    String company;

    // 생성자 정의
    Developer() {

    }

    public void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + name + "입니다.");
        System.out.println("현재 저는 " + company + "에서 공부하고 있으며, " + career + "개월차입니다.");
        System.out.println("window PC 소유 : " + window);
        System.out.println("Java 역략 : " + java);
        System.out.println("python 역량 : " + python);
        System.out.println("인 상황입니다. 열심히 하겠습니다.");
    }

    public void setDev() {

    }
}

public class Review07 {
    public static void main(String[] args) {
        // 객체 생성
        Developer developer1 = new Developer();

        // 속성에 값 대입
        developer1.name = "강수림";
        developer1.window = true;
        developer1.company = "코리아아이티아카데미";
        developer1.java = true;
        developer1.python = false;
        developer1.career = 3;

//        System.out.println("안녕하세요. 제 이름은 " + developer1.name + "입니다.");
//        System.out.println("현재 저는 " + developer1.company + "에서 공부하고 있으며, " + developer1.career + "개월차입니다.");
//        System.out.println("window PC 소유 : " + developer1.window);
//        System.out.println("Java 역략 : " + developer1.java);
//        System.out.println("python 역량 : " + developer1.python);
//        System.out.println("인 상황입니다. 열심히 하겠습니다.");

        developer1.introduce();
    }
}
