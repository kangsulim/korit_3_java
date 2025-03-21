package ch00_review;
/*
    Constructor(생성자) : 객체가 생성될 때 호출되는 특별한 메서드
        특징 :
            1) 클래스명 = 생성자명
            2) 기본 생성자 / 매개변수 생성자
                a. 기본 생성자 : 정의하지 않아도 default로 존재하지만
                    생성자를 하나라도 정의하는 순간 기본 생성자도 작성해야함
                b. 매개변수 생성자 : 객체를 생성할 때 필수적으로 요구하는
                    속성을 명시한 생성자
            3) return 이 없다. call1() - 기본 생성자 or call2() - 매개변수 생성자
            4) 형식 :
                a. 기본 생성자
                    클래스명() {}
                b. 매개변수 생성자
                    클래스명(매개변수1, 매개변수2) {
                        this.매개변수1 = 매개변수1;
                        this.매개변수2 = 매개변수2;
                    }
    생성 방법 :
        1) 타이핑
        2) 햄버거 code generate
        3) alt insert
 */
class Building {
    // 필드 선언
    int wall;
    int door;
    int window;
    String title;
    boolean elevator;
    boolean stair;

    // 여러가지 생정자 정의
    public Building() {
    }

    public Building(String title) {
        this.title = title;
    }

    public Building(int wall, int door, int window,
                    String title,
                    boolean elevator, boolean stair) {
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.title = title;
        this.elevator = elevator;
        this.stair = stair;
    }

    void showInfo() {
        System.out.println("이 건물은 " + title + "이고, 벽이 " + wall
                + "개, 문이 " + door + "개, 창문이 " + window + "개 있습니다.");
        System.out.println("엘리베이터 유무 : " + elevator);
        System.out.println("계단 유무 : " + stair);
        System.out.println();
    }
}

public class Review08 {
    public static void main(String[] args) {
        Building building1 = new Building();
        building1.elevator = false;
        building1.stair = false;
        building1.wall = 5;
        building1.door = 2;
        building1.window = 6;
        building1.title = "재팬아이티타운";

        Building building2 = new Building("코리아아이티타운");
        building2.elevator = true;
        building2.stair = true;
        building2.wall = 8;
        building2.door = 4;
        building2.window = 230;

        Building building3 = new Building(3, 1, 0, "컴퓨터타운", false, true);

        building1.showInfo();
        building2.showInfo();
        building3.showInfo();
    }
}
