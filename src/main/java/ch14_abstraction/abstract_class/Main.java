package ch14_abstraction.abstract_class;

public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 객체를 생성할 수 없다
        Factory factory1 = new Factory("가전 제품 공장") {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ]을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");
            }
        };      // 특이 케이스, 메서드를 정의 X -> 객체 생성 O

        factory1.displayInfo();
        factory1.produce("백색 가전 냉장고");
        // 재사용하지 않고 한 번만 쓰고 말 예정이라면(즉 이 Main 클래스에서만 쓸 거라면), 사용하기 좋습니다.

        // 추상 클래스의 객체 -완-
        // 상속 받은 PhoneFactory 객체
        PhoneFactory phoneFactory1 = new PhoneFactory("애플 스마트폰 공장");
        System.out.println();


        // 부모 클래스에서 선언한 추상 클래스를 자식 클래스에서 구현부 작성한거 확인
        phoneFactory1.produce("아이폰17");
        phoneFactory1.manage();
        System.out.println();

        phoneFactory1.setName("삼성 스마트폰 공장");    // Factory 에서 override 하지 않은 메서드 호출
        phoneFactory1.displayInfo();
        System.out.println();

        // 즉, 오버라이딩은 `재정의`를 전제로 부모 클래스와 자식 클래스의 메서드가
        // 서로 다른 방식으로 동작하는 경우에만 이루어지면 되고,
        // 부모 클래스의 메서드를 완전히 동일하게 자식 클래스에서 사용할 경우에는
        // 굳이 alt + insert 를 통해서 override method 를 할 필요가 없다.
        
        // TabletFactory 실행
        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");
        tabletFactory1.setName("구글 태블릿 공장");
        System.out.println("현재 공장은 " + tabletFactory1.getName() + "(으)로 변경되었습니다.");
        tabletFactory1.produce("구글 태블릿");
        tabletFactory1.manage();
        tabletFactory1.upgrade("구글 태블릿 10인치 2세대");
        tabletFactory1.displayInfo();
    }
}
