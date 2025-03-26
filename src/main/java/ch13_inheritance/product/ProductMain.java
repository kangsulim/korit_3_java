package ch13_inheritance.product;

public class ProductMain {
    public static void main(String[] args) {
//        Item item1 = new Item(); -> 첫 라인에서 오류가 발생한다면? Item 클래스에 가서 확인하기
        // allArgsConstructor 인데 () 내부에 argument 를 입력하지 않아서
        Item item1 = new Item("일반 상품", "일반 카테고리");

        // Item 클래스를 건드리지 않고 getter 를 사용하여 출력
        System.out.println("이 상품은 " + item1.getName() + "입니다.");
        System.out.println("이 상품은 " + item1.getCategory() + "입니다.");

        /*
            Product 클래스의 인스턴스 product1을 생성하는데
            이름 : 전자 제품
            카테고리 : 가전 제품
            가격 : 100000
            재고 : 10
            setter 사용 : 가전 제품 -> 백색 가전 제품
            getter 사용 : 출력
         */

        Product product1 = new Product("전자 제품", "가전 제품", 100000, 10);
        product1.setCategory("백색 가전 제품");
        System.out.println("해당 제품은 " + product1.getCategory() + "입니다.");
        product1.display();
    }
}
