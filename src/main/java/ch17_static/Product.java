package ch17_static;

import lombok.Getter;

@Getter // 여기 @Getter는 static method와 관계 없음
public class Product {
    // 필드 선언
    // static 변수 선언, 초기화
    @Getter // 필드 레벨에서의 getter
    // Lombok을 사용하지 않은 static method 정의
    private static int count = 0;

    // 메서드 정의 시에 static이 들어가면 된다(호출 시에는 Product.getTitle();)
    public static String getTitle() {
        return title;
    }

    private static String title = "제품입니다.";
    // 멤버 변수 선언, 초기화
    private int instanceCount = 0;  // 변수인데 여기에서 초기화 함

    // 객체가 만들어질 때 마다 1씩 증가하는 점은 같지만,
    // `instanceCount`는 객체가 생성될 때 항상 0으로 초기화 되지만
    // `count`는 객체가생성될 때 1씩 계속 증가한다.

    public Product() {
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");

        count++;
        instanceCount++;
    }
}
