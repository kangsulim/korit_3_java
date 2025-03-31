package ch17_static.singleton.products;

public class ProductView {
    // 정적 변수 선언 -> ProductView 클래스의 instance : 여기에 생성자를 대입할 것
    // 대부분의 경우 instance
    private static ProductView instance; // 최초에 생성된 하나의 객체만을 저장할 변수

    // 생성자를 private로 선언(외부에서 new 사용 불가) -> 싱글톤 패턴시의 중요한 지점
    private ProductView(){
        int counter = 1;            // 일종의 객체 필드라고 할 수 있음
        System.out.println(counter + "번 째 객체가 생성되었습니다.");
        counter++;
    }

    // static method 정의 -> 대부분의 경우 getInstance()
    public static ProductView getInstance() {
        if (instance == null) {
            instance = new ProductView();
        }

        return instance;
    }
    
    // 정적 메서드 아님
    public void showMainView() {
        System.out.println("상품 정보를 보여주는 메인 화면");
    }
    
    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }
}
